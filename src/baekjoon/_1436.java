package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int i = 666;
		while(true) {
			if(String.valueOf(i).contains("666")) {
				count++;
				if(N == count) {
					System.out.println(i);
					break;
				}
				i++;
			} else {
				i++;
			}
		}
	}
}
