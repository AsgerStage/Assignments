package algorithms;

import java.io.*;
import java.util.*;

public class Merge {
	// This method takes two sorted arrays of integers as input parameters
	// and it should return one sorted array of integers.
	 static int[] merge(int[] A1, int[] A2) {

		int[] A3 = new int[A1.length + A2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < A1.length && j < A2.length)
		{
			if (A1[i] < A2[j])
			{
				A3[k] = A1[i];
				i++;
			}

			else 
			{
				A3[k] = A2[j];
				j++;
			}
			k++;
		}

		while (i < A1.length)
		{
			A3[k] = A1[i];
			i++;
			k++;
		}
		while (j < A2.length) {
			A3[k] = A2[j];
			j++;
			k++;
		}
		return A3;
	}

	public static void main(String[] args) throws IOException {
		new Merge().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Read numbers for first array
		int[] A1 = readIntArray(in);
		// Read numbers for second array
		int[] A2 = readIntArray(in);

		// Call merge method to merge the two arrays
		int[] solution = merge(A1, A2);

		// Output the result from the merge function
		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i] + " ");
		}
	}

	private int[] readIntArray(BufferedReader in) throws IOException {
		// First read length of input data
		int length = Integer.parseInt(in.readLine());

		// Now read the actual values
		int[] array = new int[length];
		StringTokenizer st = new StringTokenizer(in.readLine());

		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		return array;
	}
}