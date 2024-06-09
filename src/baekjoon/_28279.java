package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _28279 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		Deque<Integer> d = new LinkedList<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			
			if(k == 1) {
				d.addFirst(Integer.parseInt(st.nextToken()));
			}else if(k == 2) {
				d.addLast(Integer.parseInt(st.nextToken()));
			}else if(k == 3) {
				sb.append(d.isEmpty() ? -1:d.pollFirst()).append("\n");
			}else if(k == 4) {
				sb.append(d.isEmpty() ? -1:d.pollLast()).append("\n");
			}else if(k == 5) {
				sb.append(d.size()).append("\n");
			}else if(k == 6) {
				sb.append(d.isEmpty() ? 1:0).append("\n");
			}else if(k == 7) {
				sb.append(d.isEmpty() ? -1:d.peekFirst()).append("\n");
			}else if(k == 8) {
				sb.append(d.isEmpty() ? -1:d.peekLast()).append("\n");
			}
		}
		System.out.println(sb.toString());
	}

}
