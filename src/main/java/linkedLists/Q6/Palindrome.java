package linkedLists.Q6;

import java.util.Stack;
import linkedLists.Q1.Node;

/*
 Algorithm:
 1. Push the first half to stack.
 2. Compare the second half by poping elements from the stack.
 */

public class Palindrome {
	Node head;

	public int getLength() {
		int count = 1;
		Node temp = head;

		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void check() {
		Stack<Integer> stack = new Stack<>();
		int len = getLength(), count = 0;
		Node temp = head;

		while (count++ < len / 2) {
			stack.push(temp.data);
			temp = temp.next;
		}

		// If odd length, skip the mid node
		if (len % 2 != 0) {
			temp = temp.next;
		}

		while (temp.next != null && !stack.isEmpty()) {
			if (temp.data != stack.pop()) {
				System.out.println("Not a Palindrome");
				return;
			}
			temp = temp.next;
		}
		System.out.println("It's a Palindrome");

	}

	public static void main(String[] args) {
		Palindrome list = new Palindrome();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(1);

		System.out.println("Length is: " + list.getLength());

		list.check();
	}

}
