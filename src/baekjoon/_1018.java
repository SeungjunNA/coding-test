package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Boolean[][] arr = new Boolean[n][m];
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	String str = st.nextToken();
        	for(int j=0;j<str.length();j++) {
        		if(str.charAt(j) == 'B') arr[i][j] = true;
        		else arr[i][j] = false;
        	}
        }
        int min = n*m;
        for(int i=0;i<=n-8;i++) {
        	for(int j=0;j<=m-8;j++) {
        		boolean color = arr[i][j];
        		int count = 0;
        		for(int k=0;k<8;k++) {
        			for(int l=0;l<8;l++) {
        				if(arr[i+k][j+l] != color) count++;
        				color = !color;
        			}
        			color = !color;
        		}
        		count = Math.min(count, 64-count);
        		min = Math.min(min, count);
        	}
        }
        System.out.println(min);
	}

}
