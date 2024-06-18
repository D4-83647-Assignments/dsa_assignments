package Linkedlist;

public class Question2 {

	public static void main(String[] args) {
SinglyLinearList list = new SinglyLinearList();
		
		list.addFirst(33);
		list.addFirst(22);
		list.addFirst(11);
		list.addLast(44);
		list.addLast(55);
		//add element 66 after after 44
		list.insertAfterNode(66, 44);
		
		//add element 66 before 44
		list.insertBeforeNode(77, 44);
		list.displayList();

	}

}
