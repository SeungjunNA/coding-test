package baekjoon;

import java.util.*;
import java.io.*;
// 다시 풀거
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
