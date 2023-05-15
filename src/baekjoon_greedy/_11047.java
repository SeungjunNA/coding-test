package baekjoon_greedy;

import java.util.Scanner;

public class _11047 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;
		
		int[] coin = new int[k];
		for(int i=0;i<n;i++) {
			coin[i] = scan.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			if(k/coin[i] > 0) {
				count += k/coin[i];
				k -= k/coin[i] * coin[i];
			}
		}
		
		System.out.println(count);
	}

}
