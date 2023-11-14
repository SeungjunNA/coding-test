package swea_D3;

import java.util.*;
import java.io.*;
class _1216_3일차_회문2
{
    static char[][] map;
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int t=1;t<=10;t++){
        	int N = Integer.parseInt(br.readLine());
            map = new char[100][100];
            for(int i=0;i<100;i++){
            	String str = br.readLine();
                for(int j=0;j<100;j++){
                	map[i][j] = str.charAt(j);
                }
            }
            
            int max = 0;
            for(int i=0;i<100;i++){
            	for(int j=0;j<100;j++){
                    StringBuilder sb = new StringBuilder();
                    for(int k=0;j+k<100;k++){
                    	sb.append(map[i][j+k]);

                        String reverse = sb.reverse().toString();
                        sb.reverse();                      
                        if(sb.toString().equals(reverse) && sb.length()>max){
                            max = sb.length();
                        }
                    }
                    sb = new StringBuilder();
                    for(int k=0;i+k<100;k++){
                    	sb.append(map[i+k][j]);
                        String reverse = sb.reverse().toString();
                        sb.reverse();
                        if(sb.toString().equals(reverse) && sb.length()>max){
                        	max = sb.length();
                        }
                    }
                }
            }
            System.out.printf("#%d %d\n",t,max);
        }
	}
}