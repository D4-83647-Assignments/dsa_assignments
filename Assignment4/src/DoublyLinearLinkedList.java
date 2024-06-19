

public class DoublyLinearLinkedList {

	//creating node as inner class (static)
		static class Node {
			private int data;//data to store
			private Node next;//reference to next node
			private Node prev;
			//initialize node data
			public Node(int value) {
				next = prev = null;
				data = value;//initialize data to given value
			}
		}
		//head points to first element
		private Node head;
		//tail points to last element
		private Node tail;
		//counter counts present elements in list
		private int counter = 0;
		
		DoublyLinearLinkedList(){
			//head and tail points to null at first
			head = null;
			tail = null;
		}
		
		//add element to the first position of list
		public void addFirst(int value) {
			//create new node and add value
			Node newnode = new Node(value);
			
			//if list is empty
			if(counter == 0)
				head = tail = newnode;//add newnode to the head and tail
			else {//if list is not empty
				//add firstNode into the next of newnode
				newnode.next = head;
				//add newnode into the previous of firstNode
				head.prev = newnode;
				//point head to the newnode
				head = newnode;
			}
			//increment counter
			counter++;
			
		}
		
		//display elements in list
		public void displayForward() {
			//create traverse with reference to head
			Node trav = head;
			if(counter == 0)//if list is empty then return
				return;
			
			//print the elements one by one
			do {
				//print the first element
				System.out.print(trav.data);
				System.out.print(" ");//add space
				//add next element into trav
				trav = trav.next;
			}while(trav != null);//run the loop until trav
			
			System.out.println();
			
		}
		
		
		
		
		
		//add element to the last
		public void addLast(int value) {
			//create newnode and save the value
			Node newnode = new Node(value);
			
			if(counter == 0) {
				//if list is empty then add new node to the head
				head = tail = newnode;
			}else {//if list is not empty
				//add lastNode into the previous of newnode
				newnode.prev = tail;
				//add newnode into the next of lastNode
				tail.next = newnode;
				//move tail to newnode
				tail = newnode;
			}
			
			//increment counter
			counter++;
		}
		
		
		
		//delete first element 
		public void deleteFirst() {
			//check if list is empty
			if(counter == 0) {
				return;
			}else if(counter == 1){//if list has only one element
				head = tail = null;
			}else {//if multiple nodes in list
				//move head to second element
				head = head.next;
				//delete first element
				head.prev = null;
			}
			
			//decrement counter
			counter--;
		}
		
		
		//delete last element
		public void deleteLast() {
			
			//check if list is empty
			if(counter == 0) {
				//then simply return
				return;
			}else if(counter == 1) {
				//if only one element exist in list then delete that element
				head = tail = null;
			}else {
				//move tail to previous
				tail = tail.prev;
				//delete last element
				tail.next = null;
			}
			
			//decrement counter
			counter--;
		}
		
		//delete all
		public void deleteAll() {
			head = tail = null;//deleting all by dereferencing head
			counter = 0; //set counter to zero
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
			
			//increment counter
			counter++;
		}
		
		
		//delete at position
		public void deletePosition(int pos) {
			//create traverse
			Node trav = head;
			
			//check if list is empty
			if(head == null) {
				return;
			}else if(pos <= 1) {//if position is less than equal to one 
				head = trav.next;
			}else {
				//if list has multiple nodes
				//run loop until position is reached
				for(int i = 1; i<pos-1 && trav.next.next!=null; i++) {
					trav = trav.next;
				}
				//
				trav.next = trav.next.next;
			}
			
			//decrement counter
			counter--;
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
		
		
		//display size of list
		public int size() {
			//return counter
			return counter;
		}
}
