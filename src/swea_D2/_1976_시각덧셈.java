package swea_D2;

import java.util.*;
import java.io.*;
class _1976_½Ã°¢µ¡¼À
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            
            int result_h = h1+h2;
            int result_m = m1+m2;
           	
            if(result_m > 59){
                result_h += 1;
                result_m %= 60;
            }
            if(result_h > 12){
            	result_h -= 12;
            }
            System.out.printf("#%d %d %d\n",t,result_h,result_m);
        }
	}
}