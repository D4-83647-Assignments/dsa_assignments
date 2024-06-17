import java.util.Arrays;

public class Question1 {
	
//	Write a insertion sort function to sort array and returns no of comparisions
	
	public static void insertionSort(int arr[], int n) {
		int temp = 0;
		int comp = 0;
		for(int i = 1; i < n; i++) {
			//pick up one element
			temp = arr[i];
			int j = i-1;
			//compare picked element with all its left neighbours one by one
			while(j >= 0 && arr[j] > temp) {
//if left neighbour is greater than picked element then move left neighbour one position ahead
					arr[j + 1] = arr[j];
				j--;
			}
//			insert picked element at its appropriate position
			arr[j+1] = temp;
//			repeat above steps untill array is sorted
		}
		
		System.out.println("number of comparisons: "+ comp);
	}
	

	public static void main(String[] args) {
		int arr[] = {55,44,22,66,11,33};
		
		System.out.println("Array before sort: "+Arrays.toString(arr));

		insertionSort(arr, arr.length);
		
		System.out.println("Array after sort: "+Arrays.toString(arr));
		
		
		

	}

}
