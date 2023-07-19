package baekjoon;

import java.util.*;
import java.io.*;
public class _17219 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            String password = st.nextToken();
            map.put(id,password);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(map.containsKey(str)) sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb);
    }
}