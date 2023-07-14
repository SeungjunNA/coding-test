package baekjoon;

import java.util.*;
import java.io.*;
public class _1966 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());            
            int num = Integer.parseInt(st1.nextToken());
            int location = Integer.parseInt(st1.nextToken());
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            
            int[] arr = new int[num];
            for(int j=0;j<num;j++){
                arr[j] = Integer.parseInt(st2.nextToken());
                pq.add(arr[j]);   
            }
            int k = 0;
            while(true){
                for(int j=0;j<num;j++){
                    if(pq.peek() == arr[j]){
                        if(j==location){
                            sb.append(k+1).append("\n");
                            pq.clear();
                            break;
                        }
                        pq.poll();
                        k++;
                    }
                    
                }
                if(pq.isEmpty()) break;
            }
        }
        System.out.println(sb);
    }
}

