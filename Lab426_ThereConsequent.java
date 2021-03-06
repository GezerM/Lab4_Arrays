package day29_Arrays_Lab43;

public class Lab426_ThereConsequent {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the array contains 3 even
		// or 3 odd values all next to each other.
		int x[] = {2,1,3,5};
		int y[] = {2,1,2,5};
		int z[] = {2,4,2,5};
		
		System.out.println(thereConsequent(x));
		System.out.println(thereConsequent(y));
		System.out.println(thereConsequent(z));

	}
	public static boolean thereConsequent(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[1]%2 == 0) {
				if (arr[i + 1]%2 == 0 && arr[i + 2]%2 == 0)
					return true;
			} else {
				if (arr[i + 1]%2 == 1 && arr[i + 2]%2 == 1)
					return true;
			}
		}
		return false;
	}

}
