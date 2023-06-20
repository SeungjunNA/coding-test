package baekjoon;

import java.io.*;
public class _2523 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=N;i++){
            System.out.println("*".repeat(i));
        }
        for(int i=N-1;i>0;i--){
            System.out.println("*".repeat(i));
        }
    }
}