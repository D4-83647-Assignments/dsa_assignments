import java.util.Scanner;

public class Question6 {

	public static int linearSearch(int arr[], int n, int key) {
		int occ = 0;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == key) {
				temp = i;
				occ++;
			}
		}
		
		if(occ > 0) {
			System.out.println("number of occurences: "+ occ);
			return temp;
		}else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {11,55,22,77,88,33,99,44, 99,55,22,66,11,99,33,22,66,44,11,99,55};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Find nth occurence of element:");
		int key = sc.nextInt();
		
		int result = linearSearch(arr, arr.length, key);
		
		if(result == -1) {
			System.out.println("Key not found!");
		}else {
			System.out.println("last occurence of key at index: "+result);
		}
		
		
		
		sc.close();
	}

}
