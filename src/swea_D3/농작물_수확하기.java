package swea_D3;

import java.util.*;
import java.io.*;
class 농작물_수확하기
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         
        for(int i=1;i<=N;i++){
            int n = Integer.parseInt(br.readLine());
            int[][] matrix = new int[n][n];
             
            for(int j=0;j<n;j++){
                String str = br.readLine();
                for(int k=0;k<n;k++){
                    matrix[j][k] = str.charAt(k)-'0';
                }
            }
             
            int sum = 0;
            int l = 0;
            for(int j=0;j<=n/2;j++){
                for(int k=n/2-l;k<=n/2+l;k++){
                    sum += matrix[j][k];
                }
                l++;
            }
            l -= 2;
            for(int j=n/2+1;j<n;j++){
                for(int k=n/2-l;k<=n/2+l;k++){
                    sum += matrix[j][k];
                }
                l--;
            }
            System.out.printf("#%d %d\n",i,sum);
             
        }
    }
}
