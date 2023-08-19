package baekjoon;

import java.util.*;
import java.io.*;
public class _2178 {
    static int[][] matrix;
    static boolean[][] visit;
    static int n, m;
    static int[] x_move = {1,0,-1,0};
    static int[] y_move = {0,1,0,-1};
    static LinkedList<Matrix> queue = new LinkedList<>();    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        matrix = new int[n][m];
        visit = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<m;j++){
                matrix[i][j] = str.charAt(j)-'0';
            }
        }
        
        queue.add(new Matrix(0,0));
        bfs(0,0,1);
        
        System.out.println(matrix[n-1][m-1]);
    }
    static class Matrix{
        int x, y;
        Matrix(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void bfs(int x, int y, int k){
        if(x==n-1 && y==m-1) return;
        visit[x][y] = true;
        
        while(!queue.isEmpty()){
            Matrix mx = queue.poll();
            for(int i=0;i<4;i++){
                int X = mx.x+x_move[i];
                int Y = mx.y+y_move[i];
                if(X>=0&&Y>=0 && X<n&&Y<m){
                    if(!visit[X][Y] && matrix[X][Y]==1){
                        matrix[X][Y] = matrix[mx.x][mx.y]+1;
                        queue.add(new Matrix(X,Y));
                    }
                }
            }
        }
    }
}
