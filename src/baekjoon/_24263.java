package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24263 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N);
		System.out.println(1);
	}
}
//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n
//        sum <- sum + A[i]; # 코드1
//    return sum;
//} 코드1은 n번만큼만 실행될 것이고 최고차항은 1이므로 