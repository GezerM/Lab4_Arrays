package day28_Arrays_Lab42;

public class Lab417_DifferrenceBetweenLargestAndSmallest {

	public static void main(String[] args) {
		// Write a method that accepts an array and print the difference between the largest and
		// smallest values in the array
		int[] x = {10,3,5,6};
		int[] y = {7,2,10,9};
		int[] z = {2,10,7,2};
		
		System.out.println(difference(x));
		System.out.println(difference(y));
		System.out.println(difference(z));
		

	}
	public static int difference(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return (max - min);
	}

}
