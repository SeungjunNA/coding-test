package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9461 {
	static long[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		arr = new long[101];
		arr[1] = arr[2] = arr[3] = 1L;
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			int k = Integer.parseInt(br.readLine());
			long result = check(k);
			sb.append(result+"\n");
		}
		System.out.println(sb.toString());
	}
	static long check(int k) {
		if(arr[k] == 0) {
			return arr[k] = check(k-2) + check(k-3);
		}
		return arr[k];
	}

}
