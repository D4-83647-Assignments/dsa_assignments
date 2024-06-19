
public class Deque extends DoublyLinearLinkedList {
	
	//Deque will have following things
	//1. push and pop element from front
	//2. push and pop element from rear
	
	public Deque() {
		
	}
	
	//push element in rear
	public void rearPush(int value) {
		super.addFirst(value);
	}
	
	//pop element in rear
	public void rearPop() {
		super.deleteFirst();
	}
	
	//push element in front
	public void frontPush(int value) {
		super.addLast(value);
	}
	
	//pop element in front
	public void frontPop() {
		super.deleteLast();
	}
	
	
	
	//display deque
	public void dispalyDeque() {
		super.displayForward();
	}
}
