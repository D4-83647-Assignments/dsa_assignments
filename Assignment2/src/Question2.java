import java.util.Arrays;

public class Question2 {
	// Modify the insertion sort algorithm to sort the array in descending order
	
	//implementation of insertion sort
	//accept array and it's size
	public static void reverseInsertionSort(int arr[], int n) {
		//declare temporary variable
		int temp;
		
		//start running array in reverse order starting from second last position
		for(int i = n-2; i >= 0; i--) {
			//save the element in temporary variable
			temp = arr[i];
			//start j position from i+1 position 
			int j = i + 1;
		//start the loop if j is less than array length and jth element is greater than temporary element
			while(j < n && arr[j] > temp) {
				//if condition is true then copy jth element to j-1
				arr[j-1] = arr[j];
				//increase the position of j to next element
				j++;
			}
			
			//save the element in the last position
			arr[j-1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {55,44,22,66,11,33};//declare the array
		
		System.out.println("Array before sort: "+Arrays.toString(arr));//print the array before sorting
		
		//call the method and pass array
		reverseInsertionSort(arr, arr.length);
		
		//print the array after sorting
		System.out.println("Array after sort: "+Arrays.toString(arr));
	}

}
