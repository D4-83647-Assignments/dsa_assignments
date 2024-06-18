package Linkedlist;

import java.util.Arrays;

public class Question4 {
	
	public static void selectionSort(int arr[], int n) {
		int temp; //temporary element
		for(int i = 0; i < n-1; i++) {
			//start from first element
			for(int j = i+1; j < n; j++) {
				//start from second element
				if(arr[i] > arr[j]) {
					//if inner loop element is greater than outer loop element then swap
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {33,22,88,66,44,77,11,99,55};
		//sort the array element first
		System.out.println("array before sort: "+Arrays.toString(arr));
		selectionSort(arr, arr.length);
		SinglyLinearList list = new SinglyLinearList();
		//transfer all the elements list
		for(int i = arr.length-1; i >= 0; i--) {
			list.addFirst(arr[i]);
		}

		System.out.print("linked list after sort: ");
		list.displayList();
	}

}
