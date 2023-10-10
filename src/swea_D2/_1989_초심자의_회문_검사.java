package swea_D2;

import java.util.*;
import java.io.*;
class _1989_초심자의_회문_검사
{
	public static void main(String args[]) throws Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=T;i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int len = str.length()-1;
            
            int ans = 1;
            for(int j=0;j<len/2+1;j++){
            	if(str.charAt(j) != str.charAt(len-j)){
                	ans = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n",i,ans);
        }
    }
}