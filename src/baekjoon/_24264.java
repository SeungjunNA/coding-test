package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24264 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		
		System.out.println(N*N);
		System.out.println(2);
	}
}
//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n
//        for j <- 1 to n
//            sum <- sum + A[i] × A[j]; # 코드1
//    return sum;
//} 코드 1은 n*n만큼 실행 최고차항 차수는 2