package baekjoon;

import java.util.*;
import java.io.*;
public class _1927 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++) {
        	int k = Integer.parseInt(br.readLine());
        	if(k==0) {
        		if(pq.isEmpty()) sb.append(0+"\n");
        		else sb.append(pq.poll()+"\n");
        	}else {
        		pq.add(k);
        	}
        }
        System.out.println(sb.toString());
    }
}