package baekjoon;

import java.util.*;
import java.io.*;
public class _1764 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str = br.readLine();
            map.put(str, 1);
        }
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(map.containsKey(str)) map.put(str, 2);
            else map.put(str, 1);
        }
        
        int count = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort((s1,s2)->s1.compareTo(s2));
        for(String str : list){
            if(map.get(str)==2){
                sb.append(str).append("\n");
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sb);

    }
}