package day29_Arrays_Lab43;

public class Lab427_ThereAdjacentNumbers {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the array contains, somewhere,
		// three increasing adjacent numbers like 4,5,6,... or 23,24,25
		int[] x = {1,4,5,6,2};
		System.out.println(thereAdjacent(x));
		
		int[] y = {1,2,3}; 
		System.out.println(thereAdjacent(y));
		
		int[] z = {1,2,4,5,8,9}; 
		System.out.println(thereAdjacent(z));

	}
	public static boolean thereAdjacent(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if ((arr[i + 1]  == arr[i] + 1) && (arr[i + 2]  == arr[i] + 2)) {
				return true;			
			}
		}
		return false;
	}


}
