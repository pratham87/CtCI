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

		while (temp.next != null) {
			if (temp.next.data == node) {
				temp.next = temp.next.next;
				return;
			} else {
				temp = temp.next;
			}
		}
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
		list.head.next.next.next.next.next = new Node("f");
		list.head.next.next.next.next.next.next = new Node("h");
		list.head.next.next.next.next.next.next.next = new Node("j");

		System.out.println("Before deleting the Node:");
		list.print();

		list.deleteNode("c");

		System.out.println("\n\nAfter deleting the Node:");
		list.print();
	}
}
