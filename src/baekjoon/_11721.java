package baekjoon;

import java.util.*;
import java.io.*;

public class _11721 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         
        String str = st.nextToken();
        for(int i=0;i<str.length();i++){
            if(i != 0 && i%10==0) System.out.println();
            System.out.print(str.charAt(i));
        }
    }
}