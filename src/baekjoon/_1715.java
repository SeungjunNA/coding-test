package baekjoon;

import java.util.*;
import java.io.*;
public class _1715 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int result = 0;
        
        for(int i=0;i<n;i++) pq.add(Integer.parseInt(br.readLine()));
        while(pq.size()>1){
            pq.add(pq.poll()+pq.poll());
            result += pq.peek();
        }
        System.out.println(result);
    }
}