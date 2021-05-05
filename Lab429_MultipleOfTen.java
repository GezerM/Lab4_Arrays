package day29_Arrays_Lab43;

import java.util.Arrays;

public class Lab429_MultipleOfTen {

	public static void main(String[] args) {
		// Write a function that accepts and array. For each multiple of 10 in the given array, change all
		// the values following it to be that multiple of 10, until encountering another multiple of 10.
		int[] x = {2,10,3,4,20,5};
		System.out.println(Arrays.toString(multipleOfTen(x)));
		
		int[] y = {10,1,20,2};
		System.out.println(Arrays.toString(multipleOfTen(y)));

	}
	public static int[] multipleOfTen(int[] arr) {
		int fix = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i]%10 != 0 && fix == 0) {
							
			} else if (arr[i]%10 == 0) {
				fix = arr[i];
			} else {
				arr[i] = fix;
			}
				
		}
		return arr;
	}

}
