package dataStructure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList myList = new LinkedList();

		Node node10 = new Node(1);

		myList.insert(node10);

		Node node11 = new Node(2);
		myList.insert(node11);

		Node node13 = new Node(4);
		myList.insert(node13);

		Node node12 = new Node(3);
		myList.insert(node12);
		
		myList.removee(1);
		
		//System.out.println(myList.search(3));

		//myList.remove(12);

		myList.printLinkedList();

	}

}
