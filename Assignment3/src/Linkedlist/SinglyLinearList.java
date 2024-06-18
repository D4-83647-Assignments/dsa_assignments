package Linkedlist;
//implementation of singly linear linked list
public class SinglyLinearList {
	//creating node as inner class (static)
	static class Node {
		private int data;//data to store
		private Node next;//reference to next node
		//initialize node data
		public Node(int value) {
			data = value;//initialize data to given value
		}
	}
	//head points to first element
	private Node head;
	//tail points to last element
	private Node tail;
	//counter counts present elements in list
	private int counter = 0;
	
	SinglyLinearList(){
		//head and tail points to null at first
		head = null;
		tail = null;
	}
	
	//add element to the first position of list
	public void addFirst(int value) {
		//create new node and add value
		Node newnode = new Node(value);
		//pointing to first element
		newnode.next = head;
		//head referencing to new node
		head = newnode;
		
	}
	
	//display elements in list
	public void displayList() {
		//create traverse with reference to head
		Node trav = head;
		if(head == null)//if list is empty then return
			return;
		
		System.out.print(trav.data);
		//while trav.next has reference of next element print the value
		while(trav.next != null) {
			System.out.print("->");
			//print next element
			System.out.print(trav.next.data);
			//save next element to trav
			trav = trav.next;
		}
		System.out.println();
		
	}
	//add element to the last
	public void addLast(int value) {
		//create newnode and save the value
		Node newnode = new Node(value);
		
		if(head == null) {
			//if list is empty then add new node to the head
			head = newnode;
		}else {
			//creating trav variable pointing to first element(head)
			Node trav = head;
				//traversing until reach to last element by checking the null condition on next
				while(trav.next != null) {
					//if next element is present then save it to trav
					trav = trav.next;
				}
			
			//if trav.next is null then save newnode
			trav.next = newnode;
		}
	}
	//delete first element 
	public void deleteFirst() {
		//check if list is empty
		if(head == null) {
			return;
		}else {
			//save head.next element to the head 
			head = head.next;//even if head.next is null it will delete first element
		}
	}
	//delete last element
	public void deleteLast() {
		//check if list is empty
		if(head == null) {
			//then simply return
			return;
		}else if(head.next == null) {
			//if only one element exist in list then delete that element
			head = null;
		}else {
			//create traverse element
			Node trav = head;
			//find second last element by using trav.next.next
			while(trav.next.next != null) {
				trav = trav.next;
			}
			//if found then dereference the last element
			trav.next = null;
		}
	}
	
	//delete all
	public void deleteAll() {
		head = null;//deleting all by dereferencing head
	}
	
	//add element to given position
	public void addPosition(int value, int pos) {
		//create newnode node
		Node newnode = new Node(value);
		//if array is empty or only one element is present then add to first position
		if(pos <= 1) {
			newnode.next = head;//point to the first element
			head = newnode;//now point head to the head
			
		}else {
			//create traverse pointing to first position
			Node trav = head;
				//traverse to the position
				//start with first position and stop at second last of position
				//check if next element present or not
				for(int i = 1; i < pos-1 && trav.next != null; i++) {
					trav = trav.next;
				}
				//add element to the position
				trav.next = newnode;
			}
	}
	
	
	//print list in reverse order
	public void reversePrint(int ele) {
		//if list is empty
		if(head == null) {
			//then return 
			return;
		}else {
			//declare array
			int arr[] = new int[ele];
			//create traverse
			Node trav = head;//point to first position
			//collect elements in array
			for(int i = 0; i <= ele && trav != null; i++) {
				arr[i] = trav.data;
				trav = trav.next;
			}
			//add last element
			
			//print the array in reverse order
			for(int j = ele-1; j >= 0; j--) {
				System.out.print(arr[j]+ " ");
			}
		}
	}
	
}
