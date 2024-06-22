package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24416 {
	static int count1, count2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		count1 = count2 = 0;
		
		fib(n);
		fibonacci(n);
		
		System.out.println(count1 + " " + count2);
	}
	static int fib(int n) {
		if(n==1 || n==2) {
			count1++;
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	static int fibonacci(int n) {
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		for(int i=2;i<n;i++) {
			count2++;
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[n-1];
	}
}
