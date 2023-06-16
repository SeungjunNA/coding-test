package baekjoon;

import java.util.*;
import java.io.*;
public class _3009{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int[][] arr = new int[4][2];
        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        if(arr[0][0] == arr[1][0]){
            arr[3][0] = arr[2][0];
        }else if(arr[0][0] == arr[2][0]){
            arr[3][0] = arr[1][0];
        }else arr[3][0] = arr[0][0];
        
        if(arr[0][1] == arr[1][1]){
            arr[3][1] = arr[2][1];
        }else if(arr[0][1] == arr[2][1]){
            arr[3][1] = arr[1][1];
        }else arr[3][1] = arr[0][1];
        
        System.out.println(arr[3][0] + " " + arr[3][1]);
    }
}