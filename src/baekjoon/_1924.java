package baekjoon;

import java.util.*;
import java.io.*;

public class _1924 {
    public static void main(String args[]) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         
         int m = Integer.parseInt(st.nextToken());
         int d = Integer.parseInt(st.nextToken());
         String day = "";
         
         
         while(--m != 0){
             if(m == 2){
                 d += 28;
             }else if(m == 4 || m == 6 || m == 9 || m == 11){
                 d += 30;
             }else{
                 d += 31;
             } 
         }
         d %= 7;
         if(d == 1) day = "MON";
         else if(d == 2 ) day = "TUE";
         else if(d == 3) day = "WED";
         else if(d == 4) day = "THU";
         else if(d == 5) day = "FRI";
         else if(d == 6) day = "SAT";
         else day = "SUN";
         
         System.out.println(day);
    }
}
