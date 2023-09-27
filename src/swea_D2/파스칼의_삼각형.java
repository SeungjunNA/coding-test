package swea_D2;

import java.util.*;
import java.io.*;
class ÆÄ½ºÄ®ÀÇ_»ï°¢Çü
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1;i<10;i++){
        	int n = Integer.parseInt(br.readLine());
            int[][] matrix = new int[n][n];

            System.out.printf("#%d\n",n);            

            for(int j=0;j<n;j++) matrix[j][0] = 1;
            for(int j=1;j<n;j++){
            	for(int k=1;k<n;k++){
                	matrix[j][k] = matrix[j-1][k-1] + matrix[j-1][k];
                }
            }
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                	if(matrix[j][k] != 0) System.out.print(matrix[j][k] + " ");
                }
                System.out.println();
            }	
            
            
            
        }
	}
}