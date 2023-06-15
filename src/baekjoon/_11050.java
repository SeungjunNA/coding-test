package baekjoon;

import java.util.*;
import java.io.*;
public class _11050 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        System.out.print(factorial(N) / (factorial(K) * factorial(N - K)));
    }
    static int factorial(int n){
        if(n < 1) return 1;
        return n * factorial(n-1);
    }
}