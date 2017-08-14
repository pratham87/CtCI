package treesAndGraphs.Q4;

import treesAndGraphs.Q2.Node;

/*
 Question: The difference between heights of left subtree and right subtree is not more than 1. 
 */

public class CheckBalanced {

	public static boolean isBalanced(Node node) {
		if (node == null) {
			return true;
		}

		int lh = getHeight(node.left);
		int rh = getHeight(node.right);

		if (Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {
			return true;
		}
		return false;
	}

	public static int getHeight(Node node) {
		if (node == null) {
			return 0;
		}

		return 1 + Math.max(getHeight(node.left), getHeight(node.right));
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.right = new Node(5);

		System.out.println(isBalanced(root));
	}

}
