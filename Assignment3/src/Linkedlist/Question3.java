package Linkedlist;

public class Question3 {

	
	public static void main(String[] args) {
		SinglyLinearList list = new SinglyLinearList();
		
		list.addFirst(33);
		list.addFirst(22);
		list.addFirst(11);
		list.addLast(44);
		list.addLast(55);
//		list.addPosition(60, 1);
		
		
		//print element in reverse order
		list.reversePrint(5);
		list.displayList();
	}
}
