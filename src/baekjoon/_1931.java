package baekjoon;

import java.util.Scanner;

public class _1931 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[][] t = new int[n][2];
		for(int i=0;i<n;i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			t[i][0] = start;
			t[i][1] = end;
		}
		
		int count = 0;
		boolean[] check = new boolean[n];
		for(int i=0;i<n;i++) {
			count = count<meet(t,i,check) ? meet(t,i,check) : count;
		}
		
		System.out.println(count);
	}
	static int meet(int[][] arr, int i, boolean[] check) {
		int count = 0;
		check[i] = true;
		count++;
		System.out.println(i);
		for(int j=0,k=i;j<check.length;j++,k++) {
			if(!check[j] && arr[k][1]<=arr[k][0])
				count += meet(arr, k, check);
		}
		check[i] = false;
		
		return count;
	}
}
