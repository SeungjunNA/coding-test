package baekjoon;

import java.util.*;
import java.io.*;
public class _2583 {
    static int[][] matrix;
    static boolean visit[][];
    static int m,n,k;
    static List<Integer> list;
    static int count;
    static int[] x_move = {1,0,-1,0};
    static int[] y_move = {0,1,0,-1};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        matrix = new int[m][n];
        visit = new boolean[m][n];
        list = new ArrayList<>();
        
        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            paint(a,b,c,d);
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j] && matrix[i][j]==0){
                    count = 0;
                    dfs(i,j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int n:list)
            System.out.print(n+" ");
        
    }
    static void paint(int a, int b, int c , int d){
        for(int i=b;i<d;i++){
            for(int j=a;j<c;j++){
                matrix[i][j] = 1;
            }
        }
    }
    static void dfs(int x, int y){
        visit[x][y] = true;
        count++;
        
        for(int i=0;i<4;i++){
            int X = x+x_move[i];
            int Y = y+y_move[i];
            if(X>=0&&Y>=0 && X<m&&Y<n){
                if(!visit[X][Y] && matrix[X][Y]==0)
                    dfs(X,Y);
            }
        }
    }
}