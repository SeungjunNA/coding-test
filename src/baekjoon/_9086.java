package baekjoon;

import java.util.*;
import java.io.*;
public class _9086 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
}