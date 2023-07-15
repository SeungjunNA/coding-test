package baekjoon;

import java.util.*;
import java.io.*;
public class _13335 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        LinkedList<Integer> truck = new LinkedList<Integer>();
        LinkedList<Integer> bridge = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            truck.add(arr[i]);
        }
        for(int i=0;i<len;i++) bridge.add(0);
        
        int sum = 0;
        int count = 0;
        while(!truck.isEmpty()){
            sum -= bridge.poll();
            if(sum+truck.peek()>weight){
                bridge.add(0);
            }else{
                int t = truck.poll();
                bridge.add(t);
                sum += t;
            }
            count++;
        }
        count += len;
        System.out.println(count);
    }
}
