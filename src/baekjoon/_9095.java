package baekjoon;

import java.util.*;
import java.io.*;
public class _9095 {
    static int count;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            
            count = 0;
            n_make(num);
            System.out.println(count);
        }
    }
    static void n_make(int n){
        if(n==0){
            count++;
            return;
        }
        else if(n<0) return;
        
        n_make(n-1);
        n_make(n-2);
        n_make(n-3);
    }
}
