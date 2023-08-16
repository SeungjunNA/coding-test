package baekjoon;

import java.util.*;
import java.io.*;
public class _2667 {
    static int n;
    static int[][] matrix;
    static boolean[][] visit;
    static List<Integer> list;
    static int[] x_move = {1,-1,0,0};
    static int[] y_move = {0,0,-1,1};
    static int count = 0;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        matrix = new int[n][n];
        visit = new boolean[n][n];
        list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<n;j++){
                matrix[i][j] = str.charAt(j)-'0';
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j] && matrix[i][j]==1){
                    count = 0;
                    dfs(i,j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int n:list)
            System.out.println(n);
    }
    static void dfs(int x, int y){
        visit[x][y] = true;
        count++;
        
        for(int i=0;i<4;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<n&&Y<n){
                if(!visit[X][Y] && matrix[X][Y]==1)
                    dfs(X,Y);
            }
        }
    }
}