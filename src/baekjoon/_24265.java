package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24265 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		
		long count = 0;
		for(long i=1;i<N;i++) {
			count += i;
		}
		System.out.println(count);
		System.out.println(2);
	}

}
