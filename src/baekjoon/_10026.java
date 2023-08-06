package baekjoon;

import java.util.*;
import java.io.*;
public class _10026 {
    static char[][] graph;
    static boolean[][] visit;
    static int n;
    static int[] x_move = {1,-1,0,0};
    static int[] y_move = {0,0,-1,1};
    static int count = 0;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        graph = new char[n][n];
        visit = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<n;j++){
                graph[i][j] = str.charAt(j);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j]){
                    detect1(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
        
        count = 0;
        visit = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j]){
                    detect2(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
        
        
    }
    static void detect1(int x, int y){
        visit[x][y] = true;
        
        for(int i=0;i<4;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<n&&Y<n){
                if(!visit[X][Y] && graph[X][Y]==graph[x][y]){
                    detect1(X,Y);
                }
            }
        }
    }
    static void detect2(int x, int y){
        visit[x][y] = true;
        
        for(int i=0;i<4;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<n&&Y<n){
                if(graph[x][y]=='R' || graph[x][y]=='G'){
                    if(!visit[X][Y] && (graph[X][Y]=='R' || graph[X][Y]=='G')){
                        detect2(X,Y);
                    }
                }else{
                    if(!visit[X][Y] && graph[X][Y]=='B'){
                        detect2(X,Y);
                    }
                }
            }
        }
    }
}