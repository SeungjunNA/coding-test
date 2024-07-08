package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1149 {
	static int N;
	static int[][] arr;
	static Integer[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][3];
		dp = new Integer[N][3];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<3;i++) {
			dp[N-1][i] = arr[N-1][i];
		}
		int result = Math.min(check(0,0), Math.min(check(0,1), check(0,2)));
		System.out.println(result);
	}
	static int check(int dep, int idx) {
		if(dp[dep][idx] != null) return dp[dep][idx];
		
		if(idx == 0) {
			dp[dep][idx] = Math.min(check(dep+1,1), check(dep+1,2)) + arr[dep][idx];
		}else if(idx == 1) {
			dp[dep][idx] = Math.min(check(dep+1,0), check(dep+1,2)) + arr[dep][idx];
		}else if(idx == 2) {
			dp[dep][idx] = Math.min(check(dep+1,0), check(dep+1,1)) + arr[dep][idx];
		}
		return dp[dep][idx];
	}
	
}
