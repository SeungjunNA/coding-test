package baekjoon;

import java.util.*;
import java.io.*;
public class _4963 {
    static int[][] matrix;
    static boolean[][] visit;
    static int count;
    static int[] x_move = {-1,0,1,-1,1,-1,0,1};
    static int[] y_move = {-1,-1,-1,0,0,1,1,1};
    static int n;
    static int m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            if(n==0 && m==0) return;
            matrix = new int[m][n];
            visit = new boolean[m][n];
            count = 0;
            
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    matrix[i][j] = Integer.parseInt(st.nextToken()); 
                }
            }
            
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(!visit[i][j] && matrix[i][j]==1){
                        dfs(i,j);
                        count++;
                    } 
                }
            }
            System.out.println(count);
        }
    }
    static void dfs(int x, int y){
        visit[x][y] = true;
        
        for(int i=0;i<8;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<m&&Y<n){
                if(!visit[X][Y] && matrix[X][Y]==1){
                    dfs(X,Y);
                }
            }
        }
    }
}