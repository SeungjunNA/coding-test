package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15651 {

	static int N, M;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		for(int i=1;i<=N;i++) {
			arr[0] = i;
			search(1);
		}
		System.out.println(sb.toString());
	}
	static void search(int size) {
		if(size == M) {
			for(int n:arr) {
				sb.append(n+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1;i<=N;i++) {
			arr[size] = i;
			search(size+1);
		}
	}
}
