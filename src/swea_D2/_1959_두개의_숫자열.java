package swea_D2;

import java.util.*;
import java.io.*;
class _1959_두개의_숫자열
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
            	a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
            	b[i] = Integer.parseInt(st.nextToken());
            }
            
            int max_sum = 0;
            if(n<m){
            	for(int i=0;i<m-n+1;i++){
            		int sum = 0;
                	for(int j=0;j<n;j++){
                    	sum += a[j]*b[i+j];
                	}
                    if(max_sum<sum) max_sum = sum;
            	}
            }else{
            	for(int i=0;i<n-m+1;i++){
                	int sum = 0;
                    for(int j=0;j<m;j++){
                    	sum += a[i+j]*b[j];
                    }
                    if(max_sum<sum) max_sum = sum;
                }
            }
            System.out.printf("#%d %d\n",t,max_sum);
        }
	}
}