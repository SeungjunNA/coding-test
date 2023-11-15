package swea_D2;

import java.util.*;
import java.io.*;
class _1946_간단한_압축풀기
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	int N = Integer.parseInt(br.readLine());
            
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(t).append("\n");
            StringBuilder new_sb = new StringBuilder();
            for(int i=0;i<N;i++){
            	StringTokenizer st = new StringTokenizer(br.readLine());
                String c = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                
                for(int k=0;k<num;k++){
                	new_sb.append(c);
                    if(new_sb.length() == 10){
                        sb.append(new_sb).append("\n");
                        new_sb = new StringBuilder();
                    }
                }
            }
            sb.append(new_sb);
            System.out.println(sb.toString());
        }
	}
}