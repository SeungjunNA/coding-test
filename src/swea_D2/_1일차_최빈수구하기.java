package swea_D2;

import java.util.*;
import java.io.*;

class _1일치_최빈수구하기
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
                                               
        for(int i=0;i<N;i++){
            int[] arr = new int[101];
        	int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
        	
            int max = 0;
            int count = 0;
            for(int j=0;j<1000;j++){
            	int score = Integer.parseInt(st.nextToken());
                arr[score]++;
                
                if(count<arr[score]){
                    count = arr[score];
                    max = score;
                }else if(count==arr[score]){
                	max = max>score?max:score;
                }
            }
            System.out.printf("#%d %d\n",n,max);
        }
	}
}