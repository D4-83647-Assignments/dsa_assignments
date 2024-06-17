import java.util.Scanner;

public class Question6 {
	//Insert 5 elements in stack and find maximum value in stack without traversing it
	
	
	
	public static void main(String[] args) {
		int size = 5;
		Stack stack = new Stack(size);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		//declaring and initializing num for maximum value
		int num = 0;
		do {
			System.out.println("0.exit\n1.push\n2.pop\n3.peek\n4.maximum value");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				break;
			case 1://check whether stack is full
					if(stack.isFull()) {
						System.out.println("Stack is full");
					}else {//add number is stack is not full
						System.out.print("Enter number:");
						int temp = sc.nextInt();
						//check if temp is greater than num and if true then save it to num
						if(temp > num) {
							num = temp;
						}
						stack.push(temp);
					}
				break;
			case 2://check whether stack is empty
				if(stack.isEmpty()) {
					System.out.println("Stack is empty");
				}else {//pop element is not empty and print the element
					System.out.println(stack.pop());
				}
				break;
			case 3://check if stack is empty
				if(stack.isEmpty()) {
					System.out.println("Stack is empty");
				}else {//pop element is not empty and print the element
					System.out.println(stack.peek());
				}
				break;
			case 4:
				//print the maximum number using num
				System.out.println("Maximum number is: "+num);
				break;
			default:
				System.out.println("Wrong choice!");
			}
			
		}while(choice != 0);
		
		System.out.println("EXiting...");
		sc.close();
	}

}
