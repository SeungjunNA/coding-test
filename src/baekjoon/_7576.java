package baekjoon;

import java.util.*;
import java.io.*;
public class _7576 {
    static int n, m;
    static int[][] matrix;
    static boolean[][] visit;
    static int[] x_move = {1,0,-1,0};
    static int[] y_move = {0,1,0,-1};
    static LinkedList<Matrix> queue = new LinkedList<>();
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        
        matrix = new int[n][m];
        visit = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visit[i][j] && matrix[i][j]==1){
                    queue.add(new Matrix(i,j));
                }
            }
        }
        bfs();
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max<matrix[i][j]) max = matrix[i][j];
                if(matrix[i][j]==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(max-1);
    }
    static class Matrix{
        int x, y;
        Matrix(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void bfs(){
        
        while(!queue.isEmpty()){
            Matrix mx = queue.poll();
            visit[mx.x][mx.y] = true;
            for(int i=0;i<4;i++){
                int X = mx.x+x_move[i];
                int Y = mx.y+y_move[i];
                if(X>=0&&Y>=0 && X<n&&Y<m){
                    if(!visit[X][Y] && matrix[X][Y]==0){
                        matrix[X][Y] = matrix[mx.x][mx.y]+1;
                        visit[X][Y] = true;
                        queue.add(new Matrix(X,Y));
                    }
                }
            }
        }
    }
}
