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
//            sum <- sum + A[i] �� A[j]; # �ڵ�1
//    return sum;
//} �ڵ� 1�� n*n��ŭ ���� �ְ����� ������ 2