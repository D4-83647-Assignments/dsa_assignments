
public class Question2 {

	public static void main(String[] args) {
		
		
//		DoublyLinearLinkedList list = new DoublyLinearLinkedList();
//				
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addFirst(30);
//		list.addLast(40);
//		list.addLast(50);
//		list.deleteFirst();
//		list.deleteLast();
//		System.out.println("size of list: "+list.size());
//		list.displayForward();
		
		//Deque
		Deque deque = new Deque();
		deque.frontPush(10);
		deque.frontPush(20);
		deque.frontPush(30);
		deque.rearPush(40);
		deque.rearPush(50);
		deque.rearPush(60);
		
		deque.frontPop();
		deque.rearPop();
		
		deque.dispalyDeque();
			

	}

}
