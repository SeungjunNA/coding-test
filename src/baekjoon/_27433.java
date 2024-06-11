package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27433 {

	static int N;
	static long result = 1;;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		recursion(N);
		System.out.println(result);
	}

	static void recursion(int n) {
		if(n == 0) return;
		result *= n;
		recursion(n-1);
	}
}
