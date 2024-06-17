import java.util.Scanner;

public class Question8 {
	// to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//	no. of ele's less than or equal to x (including x).
//	Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4
	
	
	
	public static void bubbleSort(int arr[], int n) {
		int temp;//declaring temporary variable
		
		//outer loop for selecting element
		for(int i = 0; i<n; i++) {
			int j = 0;
			//inner loop for comparing each element to the right
			while(j < n-i-1) {
				//if j is greater than j+1 then swap
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				j++;
			}
		}
	}
	
	
	public static int findRank(int arr[], int number) {
		int temp = 0;
		//interating through array
		for(int i = 0; i < arr.length; i++) {
			//select number if found save it to temporary variable
			if(arr[i] == number) {
				temp = i+1;
			}
		}
		//if temp is zero which means no value found and return 0
 		if(temp == 0) {
			return -1;			
		}else {
			return temp;
		}
	}

	public static void main(String[] args) {
		int arr[] =  { 10, 20, 15, 3, 4, 4, 1 };
		
		//first sort array using bubble sort
		bubbleSort(arr, arr.length);
		
		//find position of number 4
		int number = 4;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number for their rank: ");
//		int number = sc.nextInt();
		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(" "+arr[i]);
//		}
		
		
		int result = findRank(arr, number);
		if(result == -1) {
			System.out.println("Number not found!");
		}else {
			System.out.println("Rank of the number is: "+result);			
		}

				
//		sc.close();
	}

}
