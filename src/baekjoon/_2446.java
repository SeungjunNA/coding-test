package baekjoon;

import java.util.*;
import java.io.*;
public class _2446 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat(2*(N-i)-1));
            System.out.println();
        }
        for(int i=0;i<N-1;i++){
            System.out.print(" ".repeat(N-2-i));
            System.out.print("*".repeat((i+2)*2-1));
            System.out.println();
        }
    }
}