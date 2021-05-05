package day28_Arrays_Lab42;

public class Lab419_SumAllButSkipSome {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints the total of the numbers in the
		//array, except ignore sections of numbers starting with a 6 and extending to the
		//next 7 (every 6 will be followed by at least one 7)
		int[] x = {1,2,2};
		int[] y = {1, 2, 2, 6, 99, 99, 7};
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2};
		int[] c = {1,2,2,6,99,99,6, 7,3,4, 6, 5, 7, 1};
		
		System.out.println(sumAllButSome(x));
		System.out.println(sumAllButSome(y));
		System.out.println(sumAllButSome(a));
		System.out.println(sumAllButSome(b));
		System.out.println(sumAllButSome(c));
		

	}
	public static int sumAllButSome(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != 6) {
				sum += arr[i];
			} else {
				while (i < arr.length - 1) {
					i++;
					if (arr[i] == 7) {
						break;
					}
				}
			}
		}
		return sum;
	}

}
