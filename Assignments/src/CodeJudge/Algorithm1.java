package CodeJudge;

import java.io.*;
import java.util.*;

public class Algorithm1
{
	// This method takes an array and should return the index
 	// (0-indexed) of the top point found by Algorithm 1
	private int toppoint1(int[] a) {
		
		
		for (int i=0;i<a.length-1;i++)
		{
		if (a[0]>a[1]){ return 0;}
		for (i=1;i<a.length-2;i++){
			if (a[i-1]<=a[i]){
				if (a[i]>=a[i+1]){
				return i;
			}}
		}
		if (a.length-1>a.length-2)
			return a.length-1;
		}
		return 0;
	}


	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new Algorithm1().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		} 
		
		System.out.println(toppoint1(a));
	}
}