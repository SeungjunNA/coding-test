package baekjoon;

import java.util.*;
import java.io.*;
public class _1302 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str = br.readLine();
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                map.put(str, map.get(str)+1);
            }
        }
        
        String answer = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                answer = entry.getKey();
                max = entry.getValue();
            }else if(entry.getValue()==max){
                if(entry.getKey().compareTo(answer)<1) answer = entry.getKey();
            }
        }
        System.out.println(answer);
    }
}
