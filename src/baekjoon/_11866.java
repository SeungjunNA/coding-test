package baekjoon;
import java.util.*;
import java.io.*;
public class _11866 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken())-1;
        int num = K;
        StringBuilder sb = new StringBuilder("<");
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<N;i++) list.add(i+1);
        
        for(int i=0;i<N;i++){
            sb.append(list.get(num));
            if(i != N-1){ 
                sb.append(", ");
                list.remove(num);
                num = (num + K) % list.size(); 
            }else{
                sb.append(">");
            }
        }
        System.out.println(sb);
    }
}