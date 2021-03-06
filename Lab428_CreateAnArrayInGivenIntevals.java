package day29_Arrays_Lab43;

import java.util.Arrays;

public class Lab428_CreateAnArrayInGivenIntevals {

	public static void main(String[] args) {
		// Write a method that accepts start and end numbers. Given start and end
		// numbers, return a new array containing the sequence of integers from start up to
		//	but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].
		
		System.out.println(Arrays.toString(createArray(1, 3)));

	}
	public static int[] createArray(int a, int b) {
		int[] arr = new int[b - a];
		int index = 0;
		for(int i = a; i < b ; i++) {
			arr[index] = i;
			index++;
		}
		return arr;
	}

}
