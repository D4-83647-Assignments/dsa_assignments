import java.util.Scanner;

public class Question4 {
	//Write program to implement linear queue in which front and rear starts at 0
	
	
	
	
	public static void main(String[] args) {
		
		int size = 4;
		
		LinearQueue queue = new LinearQueue(size);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("0.EXIT,\n1.push,\n2.pop,\n3.peek");
			choice = sc.nextInt();
			switch(choice) {
			case 0: 
				break;
			case 1:
				if(queue.isFull()) {
					System.out.println("Queue is full");
				}else {
					System.out.print("Enter number: ");
					int number = sc.nextInt();
					int flag = queue.push(number);
					if(flag == 0)
						System.out.println("Success");
				}
				break;
			case 2:
				if(queue.isEmpty()) {
					System.out.println("Queue is empty");
				}else {
					System.out.println(queue.pop());
				}
				break;
			case 3:
				if(queue.isEmpty()) {
					System.out.println("Queue is empty");					
				}else {
					System.out.println(queue.peek());
				}
				break;
				
			default:
				System.out.println("Wrong choice!");
				break;
				
			}
			
		}while(choice != 0);
			
		sc.close();
		
		
		
		
	}

}
