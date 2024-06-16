import java.util.Scanner;

public class Question2 {

	public static int linearSearch(int arr[], int n, int key) {
		for(int i = 0; i < n; i++) {
			//if key is found return the index
			if(arr[i] == key) {
				return i;
			}
			
		}
		//return -1 if key not found
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {33,66,77,88,22,99,11,55};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key");
		int key = sc.nextInt();
		
		//using linear search
		int result = linearSearch(arr, arr.length, key);
		
		//if result is -1 then key not found
		if(result == -1) {
			System.out.println("Key not found!");
		}else {
			System.out.println("Index is: "+ result);			
		}
		
		
		sc.close();
	}

}
