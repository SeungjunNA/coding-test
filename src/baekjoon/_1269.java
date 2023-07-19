package baekjoon;import java.util.*;
import java.io.*;
public class _1269 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int x = Integer.parseInt(st.nextToken());
            if(set.contains(x)) set.remove(x);
            else set.add(x);
        }
        System.out.println(set.size());
    }
}