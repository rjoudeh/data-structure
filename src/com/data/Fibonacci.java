package com.data;

public class Fibonacci {

	public static long fib(int n) {
		if (n <= 1)
			return n;

		return fib(n - 1) + fib(n - 2);

	}

	public static long factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	static int removeDuplicates(int arr[], int n)
	{
		// Return, if array is empty
		// or contains a single element
		if (n==0 || n==1)
			return n;
	
		int[] temp = new int[n];
		
		// Start traversing elements
		int j = 0;
		for (int i=0; i<n-1; i++)
			// If current element is not equal
			// to next element then store that
			// current element
			if (arr[i] != arr[i+1])
				temp[j++] = arr[i];
		
		// Store the last element as whether
		// it is unique or repeated, it hasn't
		// stored previously
		temp[j++] = arr[n-1]; 
		
		// Modify original array
		for (int i=0; i<j; i++)
			arr[i] = temp[i];
	
		return j;
	}
	
	public static void main (String[] args) 
	{
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 1};
		int n = arr.length;
		
		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i=0; i<n; i++)
		System.out.print(arr[i]+" ");

		/*
		 * int[] solutionArray = { 1, 2, 3, 4, 5 };
		 * 
		 * shuffleArray(solutionArray); for (int i = 0; i <
		 * solutionArray.length; i++) { System.out.print(solutionArray[i] + " "
		 * ); } System.out.println(); }
		 * 
		 * // Implementing Fisher–Yates shuffle static void shuffleArray(int[]
		 * ar) { // If running on Java 6 or older, use `new Random()` on RHS
		 * here Random rnd = ThreadLocalRandom.current(); for (int i = ar.length
		 * - 1; i > 0; i--) { int index = rnd.nextInt(i + 1); // Simple swap int
		 * a = ar[index]; ar[index] = ar[i]; ar[i] = a; }
		 */
	}

	// public static void main(String[] args) {
	//
	// int[] a = { 1, 2, 3, 4, 5, 6 };
	// Random random = new Random(1);
	//
	// System.out.println(random.nextInt(50) + 1);
	//
	// // System.out.println(factorial(8));
	// //
	// // int[] a = { 1, 0, 0, 1, 1, 0, 1 };
	// // int[] b = new int[a.length];
	//
	// // char[] s = "rania".toCharArray();
	// //
	// // char c = ' ';
	// // int n = s.length;
	// //
	// // for (int i = 0; i < n; i++) {
	// // if(n - i -1 <= i) break;
	// // c = s[i];
	// // s[i] = s[n - i - 1];
	// // s[n - i - 1] = c;
	// // }
	// // System.out.println(s);
	//
	// // int count = 0;
	// // for (int i = 0; i < a.length; i++) {
	// // if(a[i] == 0)
	// // a[count++] = 0;
	// // }
	// //
	// // while(count < a.length)
	// // a[count++] = 1;
	// //
	// // System.err.println(a);
	// //
	// // int sum = 0;
	// // for (int i = 0; i < a.length; i++) {
	// // sum = sum + a[i];
	// // }
	// //
	// // for (int i = 0; i < b.length; i++) {
	// // if (i < sum - 1)
	// // a[i] = 0;
	// // else
	// // a[i] = 1;
	// // }
	//
	// // System.err.println(a);
	// // System.out.println(fib(100));
	//
	// /*
	// * for (int i = 0; i < 100; i++) { System.out.print(fib(i) + ", ");
	// *
	// * }
	// */
	// }
}
