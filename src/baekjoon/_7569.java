package baekjoon;

import java.util.*;
import java.io.*;
public class _7569 {
    static int[][][] matrix;
    static boolean[][][] visit;
    static int M, N, H;
    static LinkedList<Matrix> queue = new LinkedList<>();
    static int[] x_move = {1,0,0,-1,0,0};
    static int[] y_move = {0,1,0,0,-1,0};
    static int[] z_move = {0,0,1,0,0,-1};
    static int max = 0;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        
        matrix = new int[N][M][H];
        visit = new boolean[N][M][H];
        
        for(int k=0;k<H;k++){
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<M;j++){
                    matrix[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        
        for(int k=0;k<H;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(!visit[i][j][k] && matrix[i][j][k]==1){
                        queue.add(new Matrix(i,j,k));
                    }
                }
            }
        }
        bfs();
        
        for(int k=0;k<H;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(matrix[i][j][k]>max) max = matrix[i][j][k];
                    if(matrix[i][j][k]==0){
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        
        System.out.println(max-1);
       
    }
    static class Matrix{
        int x, y, z;
        Matrix(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    static void bfs(){
        while(!queue.isEmpty()){
            Matrix mx = queue.poll();
            visit[mx.x][mx.y][mx.z] = true;
            for(int i=0;i<6;i++){
                int X = mx.x+x_move[i];
                int Y = mx.y+y_move[i];
                int Z = mx.z+z_move[i];
               
                if(X>=0&&Y>=0&&Z>=0 && X<N&&Y<M&&Z<H){
                    if(!visit[X][Y][Z] && matrix[X][Y][Z]==0){
                        visit[X][Y][Z] = true;
                        matrix[X][Y][Z] = matrix[mx.x][mx.y][mx.z]+1;
                        queue.add(new Matrix(X,Y,Z));
                    }
                }
            }
        }
    }
}