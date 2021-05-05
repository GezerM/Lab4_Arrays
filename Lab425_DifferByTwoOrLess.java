package day29_Arrays_Lab43;

public class Lab425_DifferByTwoOrLess {

	public static void main(String[] args) {
		// Write a method that accepts two arrays of the same length. For every element in array1,
		// consider the corresponding element in array2 (at the same index). Return the count of
		// the number of times that two elements differ by 2 or less, but are not equal.
		
		int[] x = {1,2,3};
		int[] y = {2,3,10};
		System.out.println(differByTwo(x, y));
		System.out.println(differByTwo(y, x));
		
		System.out.println("-------------------");
		
		int[] a = {1,2,3};
		int[] b = {2,3,5};
		System.out.println(differByTwo(a, b));
		System.out.println(differByTwo(b, a));
		

	}
	public static int differByTwo(int[] arr1, int[] arr2) {
		int count = 0;
		if (arr1.length != arr2.length) { // this is not required in the question, but you know..
			System.out.println("This is not fair, you should have given the arrays in the same length at the first place dude!");
			return 666; // He deserves the sign of the beast!
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if ((arr1[i] - arr2[i]) > 0 && (arr1[i] - arr2[i]) <=2) {
					count++;
				} else if ((arr1[i] - arr2[i]) < 0 && (arr1[i] - arr2[i]) >= -2) {// there is a class called Math that can do "absolute value" 
					count++;                                                      // thing, but for the sake of whatever I doing this hard coding.
				}
			}
		}
		
		return count;
	}

}
