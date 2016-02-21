package algorithms;

import java.io.*;
import java.util.*;

public class MergeSort {
	// This method takes an array of integers as input parameter,
	// and it should then return the integers sorted
	// in ascending order using the MergeSort algorithm.
	protected int[] sort(int[] numbers) {
		mergeSort(numbers);

		return numbers;

	}

	static void mergeSort(int[] numbers) {
		if (numbers.length > 1) {
			int[] first = new int[numbers.length / 2];
			int[] last = new int[numbers.length - first.length];

			first = Arrays.copyOfRange(numbers, 0, first.length);
			last = Arrays.copyOfRange(numbers, first.length, numbers.length);
			mergeSort(first);
			mergeSort(last);
			merge(numbers, first, last);
		}

	}

	static int[] merge(int[] numbers, int[] A1, int[] A2) {

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < A1.length && j < A2.length) {
			if (A1[i] < A2[j]) {
				numbers[k] = A1[i];
				i++;
			}

			else {
				numbers[k] = A2[j];
				j++;
			}
			k++;
		}

		while (i < A1.length) {
			numbers[k] = A1[i];
			i++;
			k++;
		}
		while (j < A2.length) {
			numbers[k] = A2[j];
			j++;
			k++;
		}
		return numbers;
	}

	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new MergeSort().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = readIntArray(in);

		numbers = sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	private int[] readIntArray(BufferedReader in) throws IOException {
		int length = Integer.parseInt(in.readLine());
		int[] array = new int[length];
		StringTokenizer st = new StringTokenizer(in.readLine());

		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		return array;
	}
}