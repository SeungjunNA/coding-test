package baekjoon;

import java.util.*;
import java.io.*;
// dfs
public class _1012 {
    public static int n;
    public static int m;
    static int k;
    static int matrix[][];
    static boolean visit[][];
    static int count;
    static int[] x_move = {1,-1,0,0};
    static int[] y_move = {0,0,-1,1};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            count = 0;
            
            matrix = new int[n][m];
            visit = new boolean[n][m];
            for(int j=0;j<k;j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                matrix[x][y] = 1;
            }
            
            for(int j=0;j<n;j++){
                for(int l=0;l<m;l++){
                    if(!visit[j][l] && matrix[j][l]==1){
                        detect(j,l,n,m);
                        count++;
                    }
                }
            }
            System.out.println(count);
            
        }
        
    }
    
    public static void detect(int x, int y,int n, int m){
        visit[x][y] = true;
        
        for(int i=0;i<4;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<n&&Y<m){
                if(!visit[X][Y] && matrix[X][Y]==1){
                    detect(X,Y,n,m);

                }
            }
        }
    }
}

//bfs
//import java.util.*;
//import java.io.*;
//public class MyClass {
//    static int N, M, K;
//    static int[][] matrix;
//    static boolean[][] visit;
//    static int count;
//    static LinkedList<Matrix> queue;
//    static int[] x_move = {1,0,-1,0};
//    static int[] y_move = {0,1,0,-1};
//    public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        
//        for(int i=0;i<T;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            M = Integer.parseInt(st.nextToken());
//            N = Integer.parseInt(st.nextToken());
//            K = Integer.parseInt(st.nextToken());
//            
//            matrix = new int[N][M];
//            visit = new boolean[N][M];
//            count = 0;
//            
//            for(int j=0;j<K;j++){
//                st = new StringTokenizer(br.readLine());
//                int x = Integer.parseInt(st.nextToken());
//                int y = Integer.parseInt(st.nextToken());
//                
//                matrix[y][x] = 1;
//            }
//            
//            
//            for(int j=0;j<N;j++){
//                for(int k=0;k<M;k++){
//                    if(!visit[j][k] && matrix[j][k]==1){
//                        count++;
//                        bfs(j,k);
//                    }
//                }
//            }
//            
//            System.out.println(count);
//        }
//    }
//    static class Matrix{
//        int x, y;
//        Matrix(int x, int y){
//            this.x = x;
//            this.y = y;
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
//                if(X>=0&&Y>=0 && X<N&&Y<M){
//                    if(!visit[X][Y] && matrix[X][Y]==1){
//                        visit[X][Y] = true;
//                        queue.add(new Matrix(X,Y));
//                    }
//                }
//            }
//        }
//    }
//}