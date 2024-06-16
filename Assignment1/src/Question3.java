import java.util.Scanner;

public class Question3 {
	
	public static int linearSearch(int arr[], int n, int key) {
		int i = 0;
		int comparisons = 0;
		boolean flag = false;
		int temp = 0;
		while(i < n) {
			
			if(flag) {
				break;
			}else {
				if(arr[i] == key) {
					//store index in temp
					temp = i;
					flag = true;
				}				
			}
			//increase comparisons every iterations
			comparisons++;
			i++;
		}
		//if not found return -1
		if(temp == 0)
			return -1;
		
		//if found then print no. of comparisons and return index
		System.out.println("Number of comparisons: "+comparisons);
		return temp;
		
	}
	
	
	public static int binarySearch(int arr[], int n, int key) {
		int left = 0;
		int right = n;
		boolean flag = false;
		int comparisons = 0;
		int temp = -1;
		
		for(int i = 0; i < n; i++) {
			//dividing array in two parts
			int middle = (left+right)/2;
			//comparing middle element
			if(arr[middle] == key) {
				//if true then save and break the loop
				temp = middle;
				flag = true;
				break;
			}else {
				if(key > arr[middle]) {
					left = middle + 1;
				}else {
					right = middle - 1;
				}
				comparisons++;
			}
		}
		//if the flag is true then print comparisons and return index
		if(flag) {
			System.out.println("Number of Comparisons: "+comparisons);
			return temp;
		}
		//if key not found return -1
		return -1;
	}
	
	public static void main(String [] args) {
		//int arr[] = {33,66,77,88,22,99,11,55};
		
		int arr[] = {11, 22, 33, 44, 55, 66,77, 88, 99};
		
		System.out.print("Enter key:");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		//using linear searching
		//int result = linearSearch(arr, arr.length, key);
		
		//using binary searching
		int result = binarySearch(arr, arr.length, key);
		
		if(result != -1) {
			System.out.println("Key found at index: "+result);
		}else {
			System.out.println("Key not found!");			
		}
		
	}
}
