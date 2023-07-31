package baekjoon;

import java.util.*;
import java.io.*;
public class _11729 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println((int)(Math.pow(2,n))-1);
        hanoi(n,1,2,3);
        System.out.println(sb);
    }
    static void hanoi(int n, int a, int b, int c){
        if(n==1){
            sb.append(a).append(" ").append(c).append("\n");
            return;
        }
        hanoi(n-1,a,c,b);
        sb.append(a).append(" ").append(c).append("\n");
        hanoi(n-1,b,a,c);
    }
}