
public class Question1 {

	//1. Implement stack and queue using linked list.
	
	//stack will have Last in First Out
	//1.add Last
	//2.First out
	
	
	//queue will have First in First Out
	//1.add Last 
	//2.First out

	
	
	
	public static void main(String[] args) {
		//stack implementation
		Stack stack = new Stack();
		//add element in stack
		stack.addLast(10);
		stack.addLast(20);
		stack.addLast(30);
		stack.addLast(40);
		stack.addLast(50);
		//delete element in stack
		stack.deleteLast();
		
		//display list
		stack.displayList();
		
		
//		//Queue implementation
		Queue queue = new Queue();
		//add element in queue
		queue.addLast(10);
		queue.addLast(20);
		queue.addLast(30);
		queue.addLast(40);
		queue.addLast(50);
		
		
		//delete element in queue
		queue.deleteFirst();
		queue.deleteFirst();
		queue.deleteFirst();
		
		queue.displayList();
		
		
		
	}

}
