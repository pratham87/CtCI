package linkedLists.Q5;

import linkedLists.Q1.Node;

/*
 Algorithm: Helper Class: CreateList
 1. Iterate through the lists and create a StringBuilder.
 2. Reverse them, convert them to Integer and add them.
 3. Create a list from the result.
 */

public class SumLists {

	CreateList list = new CreateList();

	public CreateList sum(Node head1, Node head2) {
		Node temp1 = head1, temp2 = head2;
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();

		while (temp1 != null) {
			num1.append(temp1.data);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			num2.append(temp2.data);
			temp2 = temp2.next;
		}

		int sum = Integer.valueOf(num1.reverse().toString()) + Integer.valueOf(num2.reverse().toString());

		String result = new StringBuilder(String.valueOf(sum)).reverse().toString();

		list.head = new Node(Character.getNumericValue(result.charAt(0)));

		for (int i = 1; i < result.length(); i++) {
			list.add(new Node(Character.getNumericValue(result.charAt(i))));
		}

		list.print();

		return list;
	}

	public static void main(String[] args) {

		SumLists list = new SumLists();

		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);

		Node head2 = new Node(1);
		head2.next = new Node(2);
		head2.next.next = new Node(3);

		list.sum(head1, head2);
	}
}
