package swea_D2;

import java.util.*;
import java.io.*;
class _1966_숫자를_정렬하자
{
	public static void main(String args[]) throws Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
            	arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder("#").append(t).append(" ");
            for(int i=0;i<N;i++){
            	sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}