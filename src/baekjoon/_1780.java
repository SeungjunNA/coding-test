package baekjoon;

import java.io.*;
import java.util.*;
public class _1780 {
    static int N;
    static int[][] matrix;
    static int a,b,c;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        matrix = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        a = b = c = 0;
        paper(0,0,N);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void paper(int x, int y, int size){
        if(possible(x,y,size)){
            if(matrix[x][y]==0){
                b++;
            }else if(matrix[x][y]==1){
                c++;
            }else a++;
            return;
        }
        
        int new_size = size/3;
        paper(x,y,new_size);
        paper(x,y+new_size,new_size);
        paper(x,y+new_size*2,new_size);
        paper(x+new_size,y,new_size);
        paper(x+new_size,y+new_size,new_size);
        paper(x+new_size,y+new_size*2,new_size);
        paper(x+new_size*2,y,new_size);
        paper(x+new_size*2,y+new_size,new_size);
        paper(x+new_size*2,y+new_size*2,new_size);
    }
    static boolean possible(int x, int y, int size){
        int n = matrix[x][y];
        
        for(int i=x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(matrix[i][j]!=n) return false;
            }
        }
        return true;
    }
}
