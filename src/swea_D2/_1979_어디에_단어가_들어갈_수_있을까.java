package swea_D2;

import java.util.*;
import java.io.*;
class _1979_어디에_단어가_들어갈_수_있을까
{
    static int count, n, k;
    static int[][] matrix;
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int a=1;a<=T;a++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            count = 0;
            matrix = new int[n][n];
            for(int i=0;i<n;i++){
            	st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                	matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            int count = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                	if(matrix[i][j]==1) cnt++;
                    else if(cnt>=1 && matrix[i][j]==0){
                    	if(cnt==k) count++;
                        cnt = 0;
                    }
                }
                if(cnt==k) count++;
                cnt = 0;
            }
            for(int i=0;i<n;i++){
                cnt = 0;
            	for(int j=0;j<n;j++){
                	if(matrix[j][i]==1) cnt++;
                    else if(cnt>=1 && matrix[j][i]==0){
                    	if(cnt==k) count++;
                        cnt = 0;
                    }
                }
                if(cnt==k) count++;
                cnt = 0;
            }
            System.out.printf("#%d %d\n",a,count);
        }
	}
    
}