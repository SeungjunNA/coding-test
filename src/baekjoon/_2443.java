package baekjoon;

import java.io.*;
public class _2443 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(2*(N-i)-1));
        }
    }
}
