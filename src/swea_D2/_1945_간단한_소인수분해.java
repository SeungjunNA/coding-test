package swea_D2;

import java.util.*;
import java.io.*;
class _1945_간단한_소인수분해
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
            int n = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            while(n%11==0){
             	n /= 11;
                e++;
            }
            while(n%7==0){
                n /= 7;
                d++;
            }
            while(n%5==0){
                n /= 5;
                c++;
            }
            while(n%3==0){
            	n /= 3;
                b++;
            }
            while(n%2==0){
            	n /= 2;
                a++;
            }
            System.out.printf("#%d %d %d %d %d %d\n",t,a,b,c,d,e);
        }
	}
}