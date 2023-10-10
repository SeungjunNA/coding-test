package swea_D2;

import java.util.*;
import java.io.*;
public class _1859_백만_장자_프로젝트 {
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int a=1;a<=T;a++){
        	int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            long sum = 0;
            for(int i=0;i<N;i++){
            	arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = arr[N-1];
            for(int i=N-1;i>=0;i--){
            	if(arr[i]>=max){
                	max = arr[i];
                }else{
                    sum += (max-arr[i]);
                }
            }
            System.out.printf("#%d %d\n",a,sum);
        }
	}
}
