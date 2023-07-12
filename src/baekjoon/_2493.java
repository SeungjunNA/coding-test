package baekjoon;
import java.util.*;
import java.io.*;
public class _2493 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(i);
                arr1[i] = 0;
            }else{
                if(arr[stack.peek()]<arr[i]){
                    while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                        stack.pop();
                    }
                    if(stack.empty()) arr1[i] = 0;
                    else arr1[i] = stack.peek()+1;
                    stack.push(i);
                }else{
                    arr1[i] = stack.peek()+1;
                    stack.push(i);
                }
            }
        }
        
        for(int i=0;i<n;i++) System.out.print(arr1[i] + " ");
    }
}