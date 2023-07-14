package baekjoon;

import java.util.*;
import java.io.*;
public class _2146{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}
