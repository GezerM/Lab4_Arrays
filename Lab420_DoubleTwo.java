package day28_Arrays_Lab42;

public class Lab420_DoubleTwo {

	public static void main(String[] args) {
		// TWrite a method that accepts an array and prints true if the array contains a 2
		// next to a 2 somewhere
		
		int[] x = {1,2,2};
		int[] y = {1, 2, 1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(nextToTwo(x));
		System.out.println(nextToTwo(y));
		System.out.println(nextToTwo(a));
		System.out.println(nextToTwo(b));		

	}
	public static boolean nextToTwo (int[] arr) {
	
		for(int i = 0; i < arr.length - 1; i++) { // you don't need to check the last one!
			if (arr[i] == 2 && arr[i + 1]  ==2) {
				return true;
			}
		}
		
		return false;
	}

}
