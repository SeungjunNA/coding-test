package swea_D3;

import java.util.*;
import java.io.*;
class _1228_8일차_암호문1
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1;t<=10;t++){
        	int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<N;i++){
            	list.add(Integer.parseInt(st.nextToken()));
            }
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            for(int i=0;i<N;i++){
            	if(st.nextToken().equals("I")){
                	int idx = Integer.parseInt(st.nextToken());
                    int num = Integer.parseInt(st.nextToken());
                    for(int k=0;k<num;k++){
                    	list.add(idx+k, Integer.parseInt(st.nextToken()));
                    }
                }
            }
            StringBuilder sb = new StringBuilder("#");
            sb.append(t).append(" ");
            for(int i=0;i<10;i++){
            	sb.append(list.get(i)).append(" ");
            }
            System.out.println(sb.toString());
        }
	}
}