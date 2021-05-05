package day29_Arrays_Lab43;

import java.util.Arrays;

public class Lab430_NotAlone {

	public static void main(String[] args) {
		/* It is said that an element in array is alone if there are values before and after it, and those
		values are different from it. Write a method that accepts an array and a number and
		prints the given array where every instance of the given value which is alone is replaced
		by whichever value to its left or right is larger.
		 */ 
		int[] x = {1,2,3};
		int n = 2;
		System.out.println(Arrays.toString(notAlone(x, n)));
		
		int[] y = {1, 2, 3, 2, 5, 2};
		int n1 = 2;
		System.out.println(Arrays.toString(notAlone(y, n1))); // unlike Ozzie's output it also converts the  last n1 into adjacent greater, 
												// and I believe we should do that one too. Because the requirement is for 'every instance'

	}
	public static int[] notAlone(int[] arr, int num) {
		if (arr[0] == num) { // I want to include the boundaries, namely first and last element, as well ;)
				arr[0] = arr[1];
		} else if (arr[arr.length - 1] == num){ // I want to include the boundaries, namely first and last element, as well ;)
				arr[arr.length - 1] = arr[arr.length - 2];
		} else  {
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i] == num) {	
					if (arr[i - 1] > arr[i + 1]) {
						arr[i] = arr[i - 1];
					} else {
						arr[i] = arr[i + 1];
					}					
				}
					
			}
		}
		return arr;
		
	}
}
