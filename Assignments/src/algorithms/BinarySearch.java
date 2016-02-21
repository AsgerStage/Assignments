package algorithms;

import java.io.*;
import java.util.*;

public class BinarySearch {
	// This method takes an array of integers as input parameters
	// and a value val. It should return the index of val in the array.
	// If val does not occur it should return -1.
	private int find(int[] numbers, int val) {
		// iterativ løsning:
int high=numbers.length-1;
int low=0;
while (low<=high)
{
	int mid=low+(high-low)/2;
	if (val<numbers[mid]) high=mid-1;
	else if (val>numbers[mid]) low=mid+1;
	else return mid;
}
return -1;
		
	}

	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new BinarySearch().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = readIntArray(in);
		int[] queries = readIntArray(in);

		for (int i = 0; i < queries.length; i++) {
			int solution = find(numbers, queries[i]);
			System.out.println(solution);
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