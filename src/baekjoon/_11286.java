package baekjoon;

import java.util.*;
import java.io.*;
public class _11286 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> plusQ = new PriorityQueue<>();
        PriorityQueue<Integer> minusQ = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x<0) minusQ.add(x);
            else if(x>0) plusQ.add(x);
            else{
                if(plusQ.isEmpty() && minusQ.isEmpty()) sb.append(0).append("\n");
                else if(plusQ.isEmpty()) sb.append(minusQ.poll()).append("\n");
                else if(minusQ.isEmpty()) sb.append(plusQ.poll()).append("\n");
                
                else if(Math.abs(minusQ.peek())<=plusQ.peek()) sb.append(minusQ.poll()).append("\n");
                else sb.append(plusQ.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }
}