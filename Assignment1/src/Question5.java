import java.util.Scanner;

	

public class Question5 {
	//normal binary search
//	public static int binarySearch(int arr[], int n, int key) {
//		int left = 0;
//		int right = n;
//		int middle;
//		
//		for(int i = 0; i < n; i++) {
//			middle = (left + right)/2;
//				if(arr[middle] == key) {
//					return middle;
//				}
//				else if(key > arr[middle]) {
//					left = middle + 1;
//				}
//				else {
//					right = middle - 1;
//				}
//		}
//		
//		return -1;
//	}
	
	//implementing binary search for reverse array
	public static int binarySearch(int arr[], int n, int key) {
		int left = 0;
		int right = n;
		int middle;
		
		for(int i = 0; i < n; i++) {
			middle = (left + right)/2;
				if(arr[middle] == key) {
					return middle;
				}
				else if(key > arr[middle]) {
					//instead of right we move to left
					right = middle - 1;
				}
				else {
					left = middle + 1;
				}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		//int arr[] = {11,22,33,44,55,66,77,88,99};
		int arr[] = {99,88,77,66,55,44,33,22,11};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key: ");
		int key = sc.nextInt();
		
		int result = binarySearch(arr, arr.length, key);
		
		if(result == -1) {
			System.out.println("key not found!");
		}else {
			System.out.println("Index of key is: "+ result);
		}

	}

}
