package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15650 {

	static int N, M;
	static boolean[] visited;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		arr = new int[M];
		sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			visited[i] = true;
			arr[0] = i+1;
			search(i, 1);
		}
		System.out.println(sb.toString());
	}
	static void search(int current, int size) {
		if(size == M) {
			for(int n : arr) {
				sb.append(n + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=current+1;i<N;i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[size] = i+1;
				search(i, size+1);
				visited[i] = false;
			}
		}
	}

}
