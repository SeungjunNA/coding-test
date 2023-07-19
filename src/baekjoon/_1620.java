package baekjoon;

import java.util.*;
import java.io.*;
public class _1620 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Map<Integer, String> imap = new HashMap<>();
        Map<String, Integer> smap = new HashMap<>();
        for(int i=1;i<=n;i++){
            String str = br.readLine();
            imap.put(i, str);
            smap.put(str, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            String str = br.readLine();
            if(IorS(str)){
                sb.append(imap.get(Integer.parseInt(str))).append("\n");
            }else{
                sb.append(smap.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }
    
    static boolean IorS(String s){
        try{
            int x = Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}