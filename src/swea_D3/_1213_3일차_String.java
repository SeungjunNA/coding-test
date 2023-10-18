package swea_D3;

import java.io.*;
import java.util.*;
class _1213_3ÀÏÂ÷_String
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=10;i++){
        	int n = Integer.parseInt(br.readLine());
            String check = br.readLine();
            String str = br.readLine();
            int count = 0;
            
            str = str.replace(check, "*");
            for(int k=0;k<str.length();k++){
            	if(str.charAt(k)=='*') count++;
            }
            System.out.printf("#%d %d\n",n,count);
        }
	}
}