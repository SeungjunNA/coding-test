package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		String[] minus = str.split("-");
		for(int i=0;i<minus.length;i++) {
			if(minus[i].contains("+")) {
				String[] plus = minus[i].split("\\+");
				int result = 0;
				for(int j=0;j<plus.length;j++) {
					result += Integer.parseInt(plus[j]);
				}
				minus[i] = String.valueOf(result);
			}
			if(i==0) sum += Integer.parseInt(minus[0]);
			else sum -= Integer.parseInt(minus[i]);
		}
		System.out.println(sum);
	}
}
