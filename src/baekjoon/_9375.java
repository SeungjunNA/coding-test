package baekjoon;

import java.util.*;
import java.io.*;
public class _9375 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++){
            Map<String,Integer> map = new HashMap<>();
            int num = Integer.parseInt(br.readLine());
            int result = 1;
            for(int j=0;j<num;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String cloth = st.nextToken();
                
                if(!map.containsKey(cloth)) map.put(cloth,1);
                else map.put(cloth, map.get(cloth)+1);
            }
            
            for(String s : map.keySet()){
                result *= map.get(s)+1;
            }
            result -= 1;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
