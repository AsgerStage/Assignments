package CodeJudge;

import java.io.*;
import java.util.*;

public class Algorithm3 {
	// This method takes an array and the interval [i,j] it
	// should search in, and it should then return the index
	// (0-indexed) of the top point found by Algorithm 3

	private int toppoint3(int[] a, int i, int j) {
		int m = (i + j) / 2;
		if (m != 0 && m != a.length - 1) {
			if (a[m] >= a[m - 1] && a[m] >= a[m + 1])
				return m;

			else if (a[m - 1] > a[m]) {
				return toppoint3(a, i, m - 1);
			} else if (a[m] < a[m + 1]) {
				return toppoint3(a, m + 1, j);
			}
		}

		else if (m == 0 && a[m] > a[m + 1]) {
			return m;
		} else if (m == a.length - 1 && a[m] > a[m - 1]) {
			return m;
		}
		return 0;
	}

	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new Algorithm3().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(in.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(toppoint3(a, 0, n - 1));
	}
}