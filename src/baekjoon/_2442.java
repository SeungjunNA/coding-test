package baekjoon;

import java.io.*;

public class _2442 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            System.out.print(" ".repeat(N-1-i));
            System.out.print("*".repeat(i*2+1));
            System.out.println();
        }
    }
}