package baekjoon;

import java.util.*;
import java.io.*;
public class _15828 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int size = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<Integer>();
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==-1) break;
            else if(n==0 && !q.isEmpty()) q.poll();
            else{
                if(q.size()<size) q.add(n);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if(q.isEmpty()) sb.append("empty");
        else{
            while(!q.isEmpty()) sb.append(q.poll()).append(" ");
        }
        System.out.println(sb);
    }
}