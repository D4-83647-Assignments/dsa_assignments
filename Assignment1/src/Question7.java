
public class Question7 {
	
	public static int nonRepeatingElement(int arr[], int n) {
		int occ = 0;
		
		//outer loop for selecting an element
		for(int i = 0; i < n; i++) {
			//inner loop for comparing next elements
			for(int j = i+1; j < n; j++) {
				//if found the similar element break and occurrence will be plus
				if(arr[i] == arr[j]) {
					occ++;
					break;
				}
			}
			
			if(occ > 0) {
				occ = 0;
			}else if(occ == 0) {
				//if occurrence is zero then return the element
				return arr[i];				
			}
			
		}
		//if all the elements are repeated then return -1
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 7, -1, 3, 2, 1, 0, 4, -1, 7, 8 };
		
		int result = nonRepeatingElement(arr, arr.length);
		//check the result and get output
		if(result == -1) {
			System.out.println("All elements are repeated");
		}else {
			System.out.println("First non repeating ele: "+result);			
		}
		

	}

}
