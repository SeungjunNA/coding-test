package baekjoon;

import java.util.*;
import java.io.*;
public class _1158 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken())-1;
        int k = K;
        int[] arr = new int [N];
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=1;i<=N;i++) list.add(i);

        for(int i=0;i<N;i++){
            arr[i] = list.get(k);
            list.remove(k);
            if(list.size()>0) k = (k+K)%list.size();
        }
        System.out.print("<");
        for(int i=0;i<N;i++) {
            if(i!=N-1)
                System.out.print(arr[i]+", ");
            else
                System.out.print(arr[i]);
        }
        System.out.print(">");
    }
}
