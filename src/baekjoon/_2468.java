package baekjoon;

import java.util.*;
import java.io.*;
//dfs
public class _2468 {
    static int[][] matrix;
    static boolean[][] visit;
    static int n;
    static int count;
    static int max = 1;
    static int[] x_move = {1,-1,0,0};
    static int[] y_move = {0,0,-1,1};
    static int low = 100;
    static int high = 1;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        matrix = new int[n][n];
        visit = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                int x = Integer.parseInt(st.nextToken());
                matrix[i][j] = x;
                if(low>x) low = x;
                if(high<x) high = x;
            }
        }
        
        for(int i=low;i<=high;i++){
            count = 0;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(!visit[j][k] && matrix[j][k]>i){
                        dfs(j,k,i);
                        count++;
                    }
                }
            }
            if(count>max) max = count;
            visit = new boolean[n][n];
        }
        
        System.out.println(max);
    }
    static void dfs(int x, int y, int l){
        visit[x][y] = true;
        
        for(int i=0;i<4;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<n&&Y<n){
                if(!visit[X][Y] && matrix[X][Y]>l){
                    dfs(X,Y,l);
                }
            }
        }
    }
}

//bfs
//import java.util.*;
//import java.io.*;
//public class _2468 {
//    static int N;
//    static int[][] matrix;
//    static boolean[][] visit;
//    static LinkedList<Matrix> queue;
//    static int[] x_move = {1,0,-1,0};
//    static int[] y_move = {0,1,0,-1};
//    public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(br.readLine());
//        
//        matrix = new int[N][N];
//        
//        int low = 101;
//        int high = 0;
//        for(int i=0;i<N;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j=0;j<N;j++){
//                matrix[i][j] = Integer.parseInt(st.nextToken());
//                if(high<matrix[i][j]) high = matrix[i][j];
//                if(low>matrix[i][j]) low = matrix[i][j];
//            }
//        }
//        
//        int max = 1;
//        for(int i=low;i<high;i++){
//            visit = new boolean[N][N];
//            rain(i);
//            int count = 0;
//            for(int j=0;j<N;j++){
//                for(int k=0;k<N;k++){
//                    if(!visit[j][k]){
//                        bfs(j,k);
//                        count++;
//                    }
//                }
//            }
//            if(max<count) max = count;
//        }
//        
//        System.out.println(max);
//    }
//    static void rain(int k){
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                if(matrix[i][j]<=k){
//                    visit[i][j] = true;
//                }
//            }
//        }
//    }
//    static void bfs(int x, int y){
//        visit[x][y] = true;
//        queue = new LinkedList<>();
//        queue.add(new Matrix(x,y));
//        
//        while(!queue.isEmpty()){
//            Matrix mx = queue.poll();
//            for(int i=0;i<4;i++){
//                int X = mx.x+x_move[i];
//                int Y = mx.y+y_move[i];
//                if(X>=0&&Y>=0 && X<N&&Y<N){
//                    if(!visit[X][Y]){
//                        visit[X][Y] = true;
//                        queue.add(new Matrix(X,Y));
//                    }
//                }
//            }
//        }
//    }
//    static class Matrix{
//        int x, y;
//        Matrix(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//    }
//}