package baekjoon;

import java.util.*;
import java.io.*;

public class _11382 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        System.out.println(Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken()));
    }
}