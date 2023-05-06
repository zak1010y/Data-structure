
package dataStructure;


public class LinkedList {

	Node head;

	void insert(Node newNode) {

		if (head == null) {

			head = newNode;

		} else {

			Node current = head;

			while (current.next != null) {

				current = current.next;
			}

			current.next = newNode;

		}

	}

	void printLinkedList() {

		if (head == null) {

			System.out.println("The List is empty");
		} else {

			Node nodeToPrint = head;

			while (nodeToPrint != null) {

				System.out.println(nodeToPrint.id + " ");
				nodeToPrint = nodeToPrint.next;

			}
		}

	}

	void removee(int value) 
	{
		Node currentNode = head;
		Node prevNode =  null; 

		if(currentNode != null && currentNode.id == value) // if the value that the user is searching for is in the first node
		{
			head = head.next;
			//head = currentNode.next;

		}

		while(currentNode!=null && currentNode.id != value)
		{
			prevNode = currentNode;
			currentNode = currentNode.next;
		}

		if(currentNode!=null)
		{
			prevNode = currentNode.next;

		}

		if(head == null)
		{
			System.out.println(value + " isnt in the list");

		}

	}

	public boolean search(int id) {

		Node node = head;

		if (node == null) {
			return false;

		} else {

			if (head.id == id) {

				return true;
			} else {

				while (node.next != null) {

					if (node.id == id) {

						return true;
					} else {

						node = node.next;
					}

				}
				return false;
			}
		}
	}

}

class Node {

	int id;
	Node next;

	Node(int id) {

		this.id = id;
		next = null;

	}

}