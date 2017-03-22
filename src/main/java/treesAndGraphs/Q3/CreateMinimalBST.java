package treesAndGraphs.Q3;

/*
 Algorithm:
 
 1. What is method suppose to do: Find data in array and create node. (Same functionality for all nodes).
 2. Make call on another node with updated parameters and return the node. 
  
 */

public class CreateMinimalBST {

	public static Node createMinBST(int[] array, int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		Node node = new Node(array[mid]);

		node.left = createMinBST(array, start, mid - 1);
		node.right = createMinBST(array, mid + 1, end);

		return node;

	}

	public static void printInorder(Node node) {
		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		printInorder(createMinBST(array, 0, array.length - 1));
	}

}
