package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _2346 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Deque<Integer> dq = new ArrayDeque<>();
		int[] arr = new int[N];
		for(int i=1;i<=N;i++) {
			dq.add(i);
			arr[i-1] = Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			int k = dq.pollFirst();
			int x = arr[k-1];
			sb.append(k+" ");
			
			if(dq.isEmpty()) break;
			
			if(x > 0) {
				for(int j=1;j<x;j++) {
					dq.add(dq.pollFirst());
				}
			}else {
				x = x*-1;
				for(int j=1;j<=x;j++) {
					dq.addFirst(dq.pollLast());
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
