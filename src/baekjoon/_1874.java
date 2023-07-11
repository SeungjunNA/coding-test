package baekjoon;

import java.util.*;
import java.io.*;
public class _1874 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i=0;i<n;i++){
            if(k<arr[i]){
                for(int j=k+1;j<=arr[i];j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                k=arr[i];
            }else if(stack.peek() != arr[i]){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}