package swea_D3;

import java.util.*;
import java.io.*;
class _2806_N_Queen
{	
    static int count, n;
    static int[] arr;
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	n = Integer.parseInt(br.readLine());
            arr = new int[n];
            count = 0;
            
            queen(0);
            System.out.printf("#%d %d\n",t, count);
        }
	}
    static void queen(int d){
    	if(d==n){
        	count++;
            return;
        }
        for(int i=0;i<n;i++){
            arr[d] = i;
            boolean check = true;
            for(int j=0;j<d;j++){
            	if(arr[j]==arr[d] || Math.abs(j-d) == Math.abs(arr[j]-arr[d])){
					check = false;
                    break;
                }	
            }
            if(check){
            	queen(d+1);
            }
        }
    }
}
