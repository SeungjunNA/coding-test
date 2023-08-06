package baekjoon;

import java.util.*;
import java.io.*;
public class _11724 {
    static int[][] graph;
    static boolean[] visit;
    static int count = 0;
    static int n;
    static int m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        graph = new int[n+1][n+1];
        visit = new boolean[n+1];
        
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        
        for(int i=1;i<=n;i++){
            if(!visit[i]){
                detect(i);
                count++;
            }
        }
        
        System.out.println(count);
    }
    static void detect(int k){
        visit[k] = true;
        
        for(int i=1;i<=n;i++){
            if(!visit[i] && graph[k][i] == 1)
            detect(i);
        }
    }
}