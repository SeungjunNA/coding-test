package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            int k = Integer.parseInt(st.nextToken());
            map.put(k,map.getOrDefault(k,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            int k = Integer.parseInt(st.nextToken());
            if(map.containsKey(k)){
                sb.append(map.get(k)).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
