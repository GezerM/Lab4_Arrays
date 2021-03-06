package day29_Arrays_Lab43;

public class Lab424_IsEverywhere {

	public static void main(String[] args) {
		/*
		A value is "everywhere" in an array if for every pair of adjacent elements in the array, at
		least one of the pair is that value.
		Write a method that accepts an array and a number, and prints true if the given number
		is everywhere in the array
		*/
		int[] x = {1, 2, 1, 3, 1, 4, 1, 4, 2, 2};
		int a = 1;
		System.out.println(isEverywhere(x, a));
		System.out.println(isEverywhereOzzi(x, a));
		
		
		

	}
	public static boolean isEverywhere(int[] arr, int num) {
		
		
		for (int i = 0; i < arr.length-1; i++) {
			if (!(arr[i] == num || arr[i+1] == num)) {
				return false;			
			}
		}
		
		return true;
	}
	public static boolean isEverywhereOzzi(int[] arr, int num) {
		
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i] == num && arr[i+1] == num || arr[i + 2] == num) {
				return true;			
			}
		}
		
		return false;
	}

}
