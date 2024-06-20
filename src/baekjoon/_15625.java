package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15625 {
	static int N, M;
	static StringBuilder sb;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		for(int i=1;i<=N;i++) {
			arr[0] = i;
			search(i, 1);
		}
		System.out.println(sb.toString());
	}
	static void search(int n, int size) {
		if(size == M) {
			for(int k : arr) {
				sb.append(k+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=n;i<=N;i++) {
			arr[size] = i;
			search(i, size+1);
		}
	}
}
