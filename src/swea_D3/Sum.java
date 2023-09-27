package swea_D3;

import java.util.*;
import java.io.*;
class Sum
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            int[][] matrix = new int[100][100];
            int sum = 0;
             
            for(int j=0;j<100;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<100;k++){
                    matrix[j][k] = Integer.parseInt(st.nextToken());
                }
            }
             
            for(int j=0;j<100;j++){
                int a = 0;
                int b = 0;
                int c = 0;
                for(int k=0;k<100;k++){
                    a += matrix[j][k];
                    b += matrix[k][j];
                    if(j==k) c+=matrix[j][k];   
                }
                if(Math.max(Math.max(a,b),c)>sum) sum = Math.max(Math.max(a,b),c);
            }
             
            System.out.printf("#%d %d\n",n,sum);
        }
    }
}