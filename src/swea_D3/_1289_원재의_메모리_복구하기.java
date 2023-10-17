package swea_D3;

import java.util.*;
import java.io.*;

class _1289_원재의_메모리_복구하기
{
    static String str;
    static int count;
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	str = br.readLine();
            String basic = str.replace("1","0");
            boolean zero = true;
            count = 0;            
            memory(basic, zero);

            System.out.printf("#%d %d\n",t, count);
        }
	}
    static void memory(String basic, boolean zero){
    	for(int i=0;i<str.length();i++){
        	if(str.charAt(i) != basic.charAt(i)){
            	if(zero){
                    basic = basic.substring(0,i) + str.charAt(i) + basic.substring(i+1).replace("0","1");
                    zero = false;
                }else{
                    basic = basic.substring(0,i) + str.charAt(i) + basic.substring(i+1).replace("1","0");
                    zero = true;
                }
                count++;
            }
        }
    }
}

// 다르게 풀기
//import java.util.*;
//import java.io.*;
//class Solution
//{
//	public static void main(String args[]) throws Exception
//	{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        
//        for(int t=1;t<=T;t++){
//        	String str = br.readLine();
//            char basic = '0';
//            int count = 0;
//            
//            for(int i=0;i<str.length();i++){
//            	if(str.charAt(i) != basic){
//                	basic = str.charAt(i);
//                    count++;
//                }
//            }
//            
//            System.out.printf("#%d %d\n",t, count);
//        }
//	}
//}