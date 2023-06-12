package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				stack.pop();
			}
			else stack.push(num);
		}
		while(!stack.empty())
			sum += stack.pop();
		System.out.println(sum);
	}

}
