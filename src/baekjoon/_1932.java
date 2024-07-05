package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1932 {

	static int[][] arr;
	static Integer[][] dp;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		dp = new Integer[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k=0;
			while(st.hasMoreTokens()) {
				arr[i][k++] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<N;i++) {
			dp[N-1][i] = arr[N-1][i];
		}
		
		int result = check(0, 0);
		System.out.println(result);
	}
	static int check(int depth, int idx) {
		if(depth == N-1) return dp[depth][idx];
		
		if(dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(check(depth+1,idx), check(depth+1,idx+1)) + arr[depth][idx];
		}
		return dp[depth][idx];
	}
}
