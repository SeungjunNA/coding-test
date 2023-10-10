package swea_D2;

import java.util.*;
import java.io.*;
class _1984_중간_평균값_구하기
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=T;i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            int max = 0;
            int min = 10000;
            double sum = 0;
            for(int j=0;j<10;j++){
            	int num = Integer.parseInt(st.nextToken());
                if(num<min) min = num;
                if(num>max) max = num;
                sum += num;
            }
            sum -= (min+max);
            System.out.printf("#%d %d\n",i,Math.round(sum/8));
        }
	}
}