package swea_D2;

import java.util.*;
import java.io.*;
class _1948_날짜계산기
{
    static int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int startM = Integer.parseInt(st.nextToken());
         	int startD = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endD = Integer.parseInt(st.nextToken());
            
            int count = 0;
            if(startM == endM){
            	count += endD-startD+1;
            }else{
            	for(int i=startM;i<=endM;i++){
                	count += day[i-1];
                }
                count -= startD;
                count -= day[endM-1]-endD-1;
            }
            
            System.out.printf("#%d %d\n",t,count);
        }
	}
}