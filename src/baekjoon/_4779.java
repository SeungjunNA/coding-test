package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4779 {

	static boolean[] b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str=br.readLine()) != null) {
			int N = Integer.parseInt(str);
			int num = (int) Math.pow(3, N);
			
			b = new boolean[num];

			recursion(0, num, b);
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<b.length;i++) {
				if(b[i]) sb.append(" ");
				else sb.append("-");
			}
			
			System.out.println(sb.toString());
		}
	}
	
	static void recursion(int start, int end, boolean[] flag) {
		int len = end - start;
		int k = len/3;
				
		for(int i=k+start;i<2*k+start;i++) {
			flag[i] = true;
		}
		if(len==3 || len==1) return;
		
		recursion(start, start+k, flag);
		recursion(2*k+start, end, flag);
	}

}
