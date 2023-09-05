package swea_D2;

import java.util.*;
import java.io.*;
class _1926_간단한369게임
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            String s = String.valueOf(i);
            if(s.contains("3") || s.contains("6") || s.contains("9")){
            	for(int j=0;j<s.length();j++){
                	if(s.charAt(j)=='3' || s.charAt(j)=='6' || s.charAt(j)=='9'){
                    	sb.append("-");
                    }
                }
                sb.append(" ");
            } else sb.append(i).append(" ");
        }
        System.out.println(sb);
	}
}
