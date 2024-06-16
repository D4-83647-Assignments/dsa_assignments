
public class Question9 {
	
	public static void selectionSort(int arr[], int n) {
		int comparisons = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				comparisons++;
			}
		}
		System.out.println("Number of Comparisons: "+comparisons);
	}

	public static void main(String[] args) {
		int arr[] = {33,66,77,88,22,44 ,99,11,55};
		
		selectionSort(arr, arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i]);
			System.out.print(" ");
		}

	}

}
