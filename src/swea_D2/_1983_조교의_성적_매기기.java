package swea_D2;

import java.util.*;
import java.io.*;
class _1983_조교의_성적_매기기
{
    static String[] gradeArr = {"A+", "A0", "A-", "B+", "B0",  "B-", "C+", "C0", "C-", "D+", "D0"};
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=T;i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                
                arr[j] = a*35 + b*45 + c*20;
            }
           	String grade = "";
            int n = N/10;
            
            int cnt = 0;
            for(int j=0;j<N;j++){
            	if(arr[K-1]<=arr[j]) cnt++;
            }
            if(cnt%n==0) grade = gradeArr[cnt/n-1];
            else grade = gradeArr[cnt/n];
           
            System.out.printf("#%d %s\n",i,grade);
        }
	}
}