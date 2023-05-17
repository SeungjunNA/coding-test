package baekjoon;

import java.util.Scanner;

public class _11659 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N+1];
		int[] sum = new int[N+1];
		int[] result = new int[M]; 
		for(int i=1;i<N+1;i++) {
			arr[i] = scan.nextInt();
			sum[i] = sum[i-1] + arr[i];
		}
		for(int k=0;k<M;k++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			result[k] = sum[j]-sum[i-1];	
			System.out.println(result[k]);
		}
		
	}

}
