package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				stack.push(n);
			}
			else if(str.equals("pop")) {
				try {
					System.out.println(stack.pop());
				}catch(EmptyStackException e) {
					System.out.println(-1);
				}
			}
			else if(str.equals("size")) {
				System.out.println(stack.size());
			}
			else if(str.equals("empty")) {
				if(stack.empty()) System.out.println(1);
				else System.out.println(0);
			}
			else {
				if(stack.empty()) System.out.println(-1);
				else System.out.println(stack.peek());
			}
		}
	}

}
