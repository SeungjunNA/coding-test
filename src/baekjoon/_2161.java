package baekjoon;

import java.util.*;
import java.io.*;
public class _2161 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++) q.add(i);
        
        while(q.size()>1){
            sb.append(q.poll()).append(" ");
            q.add(q.poll());
        }
        sb.append(q.poll());
        System.out.println(sb);

    }
}