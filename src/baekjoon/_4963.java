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

//import java.util.*;
//import java.io.*;
//public class _4963 {
//    static int a, b;
//    static int[][] matrix;
//    static boolean[][] visit;
//    static LinkedList<Matrix> queue; 
//    static int[] x_move = {-1,-1,-1,0,0,1,1,1};
//    static int[] y_move = {-1,0,1,-1,1,-1,0,1};
//    public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        while(true){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            b = Integer.parseInt(st.nextToken());
//            a = Integer.parseInt(st.nextToken());
//            if(a==0 && b==0) break;
//            
//            matrix = new int[a][b];
//            visit = new boolean[a][b];
//            
//            for(int i=0;i<a;i++){
//                st = new StringTokenizer(br.readLine());
//                for(int j=0;j<b;j++){
//                    matrix[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//            
//            int count = 0;
//            for(int i=0;i<a;i++){
//                for(int j=0;j<b;j++){
//                    if(!visit[i][j] && matrix[i][j]==1){
//                        bfs(i,j);
//                        count++;
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
//            for(int i=0;i<8;i++){
//                int X = mx.x+x_move[i];
//                int Y = mx.y+y_move[i];
//                if(X>=0&&Y>=0 && X<a&&Y<b){
//                    if(!visit[X][Y] && matrix[X][Y]==1){
//                        visit[X][Y] = true;
//                        queue.add(new Matrix(X,Y));
//                    }
//                }
//            }
//        }
//    }
//}