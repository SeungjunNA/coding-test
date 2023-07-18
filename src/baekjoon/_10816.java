package baekjoon;

import java.util.*;
import java.io.*;
public class _10816 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] card = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            card[i] = Integer.parseInt(st.nextToken());
            if(map.isEmpty() || !map.containsKey(card[i]))
                map.put(card[i],1);
            else map.put(card[i],map.get(card[i])+1);
        } 
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] mArr = new int[m];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            mArr[i] = Integer.parseInt(st.nextToken());
            if(map.containsKey(mArr[i])){
                sb.append(map.get(mArr[i])).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        } 
        System.out.println(sb);
    }
}