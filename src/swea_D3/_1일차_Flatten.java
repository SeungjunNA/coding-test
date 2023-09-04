package swea_D3;

import java.util.*;
import java.io.*;
class _1ÀÏÂ÷_Flatten
{
	public static void main(String args[]) throws Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        for(int i=1;i<=10;i++){
        	int n = Integer.parseInt(br.readLine());
            
            int[] arr = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<100;j++){
            	arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for(int j=0;j<n;j++){
                arr[0]++;
                arr[99]--;
                Arrays.sort(arr);
            }
            System.out.printf("#%d %d\n",i,arr[99]-arr[0]);
        }
	}
}
