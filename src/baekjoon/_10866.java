package baekjoon;

import java.util.*;
import java.io.*;
public class _10866 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                list.addLast(num);
            }else if(str.equals("push_front")){
                int num = Integer.parseInt(st.nextToken());
                list.addFirst(num);
            }else if(str.equals("pop_front")){
                if(list.isEmpty()) System.out.println(-1);    
                else System.out.println(list.pollFirst());
            }else if(str.equals("pop_back")){
                 if(list.isEmpty()) System.out.println(-1);
                else System.out.println(list.pollLast());
            }else if(str.equals("size")){
                System.out.println(list.size());
            }else if(str.equals("empty")){
                if(list.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }else if(str.equals("front")){
                if(list.isEmpty()) System.out.println(-1);
                else System.out.println(list.getFirst());
            }else if(str.equals("back")){
                if(list.isEmpty()) System.out.println(-1);
                else System.out.println(list.getLast());
            }
        }
    }
}