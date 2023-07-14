package baekjoon;

import java.util.*;
import java.io.*;
public class _18258 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                q.add(Integer.parseInt(st.nextToken()));
            }else if(str.equals("pop")){
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.poll()).append("\n");
            }else if(str.equals("size")){
                sb.append(q.size()).append("\n");
            }else if(str.equals("empty")){
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }else if(str.equals("front")){
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peek()).append("\n");
            }else if(str.equals("back")){
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}