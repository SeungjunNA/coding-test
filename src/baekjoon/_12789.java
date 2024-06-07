package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class _12789 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<N;i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		
		int k = 1;

		while(!q.isEmpty()) {
			if(q.peek() == k) {
				k++;
				q.poll();
			} else {
				if(!s.isEmpty() && s.peek()==k) {
					k++;
					s.pop();
				}else s.push(q.poll());
			}
		}
		while(!s.isEmpty()) {
			if(s.peek() == k) {
				k++;
				s.pop();
			}else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
	}

}
