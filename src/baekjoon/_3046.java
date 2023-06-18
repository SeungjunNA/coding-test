package baekjoon;

import java.util.*;
import java.io.*;
public class _3046 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        System.out.println(2*S - R1);
    }
}
