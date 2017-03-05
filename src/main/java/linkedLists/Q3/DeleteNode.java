package linkedLists.Q3;

public class DeleteNode {

	Node head;

	public void deleteNode(String node) {

		if (head == null) {
			return;
		}

		Node temp = head;

		// Node to be deleted is head
		if (head.data == node) {
			head = temp.next;
			return;
		}

		for (int i = 0; i < 5; i++) {
			if (temp != null && temp.next.data != node) {
				temp = temp.next;
			}

		}

		if (temp == null || temp.next == null) {
			return;
		}

		// Node copy = temp.next.next;
		// temp.next = copy;

		temp.next = temp.next.next;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		DeleteNode list = new DeleteNode();
		list.head = new Node("a");
		list.head.next = new Node("b");
		list.head.next.next = new Node("c");
		list.head.next.next.next = new Node("d");
		list.head.next.next.next.next = new Node("e");

		System.out.println("Before deleting the Node:");
		list.print();

		list.deleteNode("c");

		System.out.println("\n\nAfter deleting the Node:");
		list.print();
	}

}
