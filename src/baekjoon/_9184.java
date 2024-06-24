package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9184 {

	static int[][][] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		check = new int[21][21][21];

		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==-1 && b==-1 && c==-1) break;
			int result = w(a,b,c);
			sb.append("w("+a+", "+b+", "+c+") = "+result+"\n");
		}
		System.out.println(sb.toString());
	}
	static int w(int a, int b, int c) {
		if(range(a,b,c) && check[a][b][c] != 0)
			return check[a][b][c];		

		if(a<=0 || b<=0 || c<=0) return 1;
		if(a>20 || b>20 || c>20) return check[20][20][20] = w(20, 20, 20);
		if(a<b && b<c) return  check[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		return check[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	static boolean range(int a, int b, int c) {
		return a>=0 && a<=20 && b>=0 && b<=20 && c>=0 && c<=20;
	}

}
