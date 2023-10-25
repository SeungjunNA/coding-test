package swea_D3;

import java.util.*;
import java.io.*;
class _4ÀÏÂ÷_°ÅµìÁ¦°ö
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1;t<=10;t++){
        	int T = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            
            int result = recursion(N, R);
            System.out.printf("#%d %d\n",t, result);
        }
	}
//	Math.pow(N, R)
    static int recursion(int n, int r){
    	if(r == 1){
            return n;
        }
        return recursion(n, r-1) * n;
    }
}