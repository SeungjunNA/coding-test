package swea_D2;

import java.io.*;
class _1970_쉬운_거스름돈
{
	public static void main(String args[]) throws Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for(int t=1;t<=T;t++){
        	int N = Integer.parseInt(br.readLine());
            int[] result = new int[8];
            StringBuilder sb = new StringBuilder();
            sb.append("#"+t+"\n");
            for(int i=0;i<8;i++){
            	result[i] = N/money[i];
                N %= money[i];
                sb.append(result[i]+" ");
            }
            System.out.println(sb.toString());
        }
    }
}