package baekjoon;
import java.util.*;
import java.io.*;
public class _7785 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String cmd = st.nextToken();
            
            if(cmd.equals("enter")) set.add(name);
            else set.remove(name);
        }

        ArrayList<String> list = new ArrayList<>(set);
//      Iterator it = set.iterator();
//      ArrayList<String> list = new ArrayList<>();
//      while(it.hasNext()){
//          list.add(String.valueOf(it.next()));
//      } 
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for(String s : list) sb.append(s).append("\n");
        System.out.println(sb);
    }
}