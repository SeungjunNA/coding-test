package baekjoon_array;

import java.util.Scanner;

public class _1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] arr = new double[N];
		double M = 0;
		double sum = 0;
		
		for(int i=0;i<N;i++) {
			arr[i] = scan.nextDouble();
			if(M<arr[i]) M = arr[i];
		}
		
		for(int i=0;i<N;i++) {
			arr[i] = arr[i]/M*100;
			sum += arr[i];
		}
		System.out.println(sum/N);
	}

}
