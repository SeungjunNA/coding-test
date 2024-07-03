package baekjoon;
import java.util.*;
import java.io.*;
public class _11279 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
        	int k = Integer.parseInt(br.readLine());
        	pq.add(k);
        	
        	if(k==0) sb.append(pq.poll()+"\n");
        }
        System.out.println(sb.toString());
    }
}