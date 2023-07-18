package baekjoon;

import java.util.*;
import java.io.*;
public class _1655 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> smallPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> largePQ = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(i==0) smallPQ.add(x);
            else if(i==1){
                if(x>=smallPQ.peek()) largePQ.add(x);
                else{
                    largePQ.add(smallPQ.poll());
                    smallPQ.add(x);
                }
            }else{
                if(smallPQ.size()==largePQ.size()){
                    if(x>=largePQ.peek()){
                        smallPQ.add(largePQ.poll());
                        largePQ.add(x);
                    }else smallPQ.add(x);
                }else if(smallPQ.size()>largePQ.size()){
                    if(x<=smallPQ.peek()){
                        largePQ.add(smallPQ.poll());
                        smallPQ.add(x);
                    }else largePQ.add(x);
                }else{
                    if(x>=largePQ.peek()){
                        smallPQ.add(largePQ.poll());
                        largePQ.add(x);
                    }else smallPQ.add(x);
                }
            }
            if(smallPQ.size() >= largePQ.size()) sb.append(smallPQ.peek()).append("\n");
            else sb.append(largePQ.peek()).append("\n");
        }
        System.out.println(sb);
    }
}