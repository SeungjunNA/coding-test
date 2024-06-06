package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _28278 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack stack = new Stack();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			
			if(k == 1) {
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
			} else if(k == 2) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else System.out.println(stack.pop());
			} else if(k == 3) {
				System.out.println(stack.size());
			} else if(k == 4) {
				if(stack.isEmpty()) System.out.println(1);
				else System.out.println(0);
			} else {
				if(stack.isEmpty()) System.out.println(-1);
				else System.out.println(stack.peek());
			}
		}
	}

}
