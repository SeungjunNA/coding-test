package swea_D2;

import java.io.*;
class _1986_지그재그_숫자
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        
        for(int i=1;i<=T;i++){
        	int n = Integer.parseInt(br.readLine());
            int ans = 0;
            if(n%2==0){
            	ans = n/2 - n;
            }else ans = n/2+1;
            
            System.out.printf("#%d %d\n",i,ans);
        }
	}
}