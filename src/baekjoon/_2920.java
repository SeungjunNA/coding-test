package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean a = false, d = false;
		int[] arr = new int[8];
		for(int i=0;i<8;i++) 
			arr[i] = Integer.parseInt(st.nextToken());

		for(int i=0;i<8;i++) {
			if(arr[i] == i+1) a = true;
			else {
				a = false;
				break;
			}
		}
		for(int i=0,j=8;i<8;i++,j--) {
			if(arr[i] == j) d = true;
			else {
				d = false;
				break;
			}
		}
		if(a) System.out.println("ascending");
		else if(d) System.out.println("descending");
		else System.out.println("mixed");
		
	}

}
