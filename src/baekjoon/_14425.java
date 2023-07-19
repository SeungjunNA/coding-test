package baekjoon;

import java.util.*;
import java.io.*;
public class _14425 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(br.readLine());
        }
        int count = 0;
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(set.contains(str)) count++;
        }
        System.out.println(count);
    }
}
