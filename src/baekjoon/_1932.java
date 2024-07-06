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
			int k = 0;
			while(st.hasMoreTokens()) {
				arr[i][k++] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<N;i++) {
			dp[N-1][i] = arr[N-1][i];
		}
		System.out.println(check(0,0));
	}
	static int check(int dep, int idx) {
		if(dep == N-1) return dp[dep][idx];
		if(dp[dep][idx] == null) dp[dep][idx] = Math.max(check(dep+1, idx), check(dep+1, idx+1)) + arr[dep][idx];
		return dp[dep][idx];
	}
}
