package module1;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
		//
		//		myList.addToBack(5);
		//
		//		myList.addToBack(4);
		//
		//		myList.addToBack(3);
		//
		//		myList.removeFromBack();
		//
		//		myList.removeFromBack();
		//
		//		myList.removeFromBack();
		//
		//		System.out.println("done with singly linked list");

		ArrayQueue<Integer> myQ = new ArrayQueue<>();
		for (int i = 0; i < 10; i++) {
			myQ.enqueue(i);
		}
		for (int i = 0; i < 10; i++) {
			myQ.dequeue();
		}
		System.out.println("done with myQ");

	}
	// close main
}// close class