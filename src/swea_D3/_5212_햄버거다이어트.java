package swea_D3;

import java.util.*;
import java.io.*;
class _5212_햄버거다이어트
{
    static int N, L;
    static int[] scores, cals;
    static int max;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            
            scores = new int[N];
            cals = new int[N];
            for(int i=0;i<N;i++){
            	st = new StringTokenizer(br.readLine());
                int score = Integer.parseInt(st.nextToken());
                int cal = Integer.parseInt(st.nextToken());
                
                scores[i] = score;
                cals[i] = cal;
            }
            
            max = 0;
            mix(0, 0, 0);
            System.out.printf("#%d %d\n",t,max);
        }
	}
    static void mix(int i, int cal, int score){
        if(cal > L) return;
        if(cal <= L) max = Math.max(max, score);
        if(i == N) return;
       
        mix(i+1, cal+cals[i], score + scores[i]);
        mix(i+1, cal, score);
    }
}