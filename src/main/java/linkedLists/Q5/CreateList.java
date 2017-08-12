package linkedLists.Q5;

import linkedLists.Q1.Node;

public class CreateList {

	Node head;

	public void add(Node node) {
		if (head == null || node.data < head.data) {
			node.next = head;
			head = node;
		}
		Node prev = head;

		while (prev.next != null && prev.next.data < node.data) {
			prev = prev.next;
		}

		node.next = prev.next; // Make next of new Node as next of prev_node
		prev.next = node; // Make next of prev_node as new_node

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

}
