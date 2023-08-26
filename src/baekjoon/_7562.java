package baekjoon;

import java.util.*;
import java.io.*;
public class _7562 {
    static int k;
    static int[][] matrix;
    static boolean[][] visit;
    static LinkedList<Matrix> queue;
    static int start_x, start_y;
    static int end_x, end_y;
    static int[] x_move = {-2,-2,-1,-1,1,1,2,2};
    static int[] y_move = {-1,1,-2,2,-2,2,-1,1};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            k = Integer.parseInt(br.readLine());
            matrix = new int[k][k];
            visit = new boolean[k][k];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            start_x = Integer.parseInt(st.nextToken());
            start_y = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            end_x = Integer.parseInt(st.nextToken());
            end_y = Integer.parseInt(st.nextToken());
            
            bfs(start_x, start_y, end_x, end_y);
            System.out.println(matrix[end_x][end_y]);
        }
    }
    static class Matrix{
        int x, y;
        Matrix(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void bfs(int start_x, int start_y, int end_x, int end_y){
        queue = new LinkedList<>();
        queue.add(new Matrix(start_x, start_y));
        visit[start_x][start_y] = true;
        
        while(!queue.isEmpty()){
            Matrix mx = queue.poll();
            if(mx.x==end_x && mx.y==end_y){
                return;
            }
            for(int i=0;i<8;i++){
                int X = mx.x+x_move[i];
                int Y = mx.y+y_move[i];
                if(X>=0&&Y>=0 && X<k&&Y<k){
                    if(!visit[X][Y]){
                        visit[X][Y] = true;
                        queue.add(new Matrix(X,Y));
                        matrix[X][Y] = matrix[mx.x][mx.y]+1;
                    }
                }
            }
        }
    }
}