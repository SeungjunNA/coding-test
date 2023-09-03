package swea_D3;

import java.util.*;
import java.io.*;
class _1ÀÏÂ÷_View
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        for(int i=1;i<=10;i++){
            int n = Integer.parseInt(br.readLine());            
            int[] arr = new int[n];
             
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
             
            
            int count = 0;
            for(int j=2;j<n-2;j++){
                int min = 0;
                if(arr[j]-arr[j-1]>0 && arr[j]-arr[j-2]>0 && arr[j]-arr[j+1]>0 && arr[j]-arr[j+2]>0){
                    min = Math.min(arr[j]-arr[j-1], arr[j]-arr[j-2]);
                    min = Math.min(min, arr[j]-arr[j+1]);
                    min = Math.min(min, arr[j]-arr[j+2]);                    
                    count += min;
                }
            }
            System.out.printf("#%d %d\n",i,count);
        }
     }
}