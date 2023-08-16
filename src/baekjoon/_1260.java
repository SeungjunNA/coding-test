package baekjoon;

import java.util.*;
import java.io.*;
public class _1260 {
    static int[][] matrix;
    static boolean[] visit;
    static StringBuilder sb;
    static int n, m, v;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        
        matrix = new int[n+1][n+1];
        visit = new boolean[n+1];
        
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            matrix[a][b] = matrix[b][a] = 1;
        }
        
        sb = new StringBuilder();
        dfs(v);
        System.out.println(sb);
        
        sb = new StringBuilder();
        visit = new boolean[n+1];
        bfs();
        System.out.println(sb);
        
    }
    static void dfs(int k){
        visit[k] = true;
        sb.append(k).append(" ");
        for(int i=1;i<=n;i++){
            if(matrix[i][k]==1 && !visit[i]){
                dfs(i);
            }
        }
    }
    static void bfs(){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visit[v] = true;
        sb.append(v).append(" ");
        
        while(!queue.isEmpty()){
            int k = queue.poll();
            for(int i=1;i<=n;i++){
                if(!visit[i]&&matrix[i][k]==1){
                    queue.add(i);
                    visit[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}