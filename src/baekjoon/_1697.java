package baekjoon;

import java.util.*;
import java.io.*;
public class _1697 {
    static int N, K;
    static int count = 0;
    static int[] location;
    static boolean[] visit;
    static LinkedList<Integer> queue = new LinkedList<>();
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        location = new int[100001];
        visit = new boolean[100001];
        
        bfs();
        
     
        System.out.println(location[K]);
    }
    static void bfs(){
        queue.add(N);
        location[N] = 0;
        visit[N] = true;
        while(!queue.isEmpty()){
            int n = queue.poll();
           
            int[] move = {2*n,n+1,n-1};
            for(int i=0;i<3;i++){
                int loc = move[i];
                if(loc>=0 && loc<=100000){
                    if(!visit[loc]){
                        location[loc] = location[n]+1;
                        visit[loc] = true;
                        queue.add(loc);
                    }
                }
                if(loc==K) return;
            }
        }
    }
}