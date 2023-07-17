package baekjoon;
import java.util.*;
import java.io.*;
public class _11279 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(q.isEmpty()) sb.append(0).append("\n");
                else sb.append(q.poll()).append("\n");
            }else{
                q.add(x);
            }
        }
        System.out.println(sb);
    }
}