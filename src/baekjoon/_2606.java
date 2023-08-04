package baekjoon;

import java.util.*;
import java.io.*;
// dfs¹æ½Ä
public class _2606 {
    static int[][] edge;
    static boolean[] checked;
    static int count = 0;
    static int n;
    static int m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        
        edge = new int[n+1][n+1];
        checked = new boolean[n+1];
        
        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            edge[a][b] = edge[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }
    static void dfs(int k){
        checked[k] = true;

        for(int i=1;i<=n;i++){
            if(!checked[i] && edge[k][i] == 1){
                count++;
                dfs(i);
            }
        }
    }
}