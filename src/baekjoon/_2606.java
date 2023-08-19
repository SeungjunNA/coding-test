package baekjoon;

import java.util.*;
import java.io.*;
// dfs방식
public class _2606 {
    static int[][] edge;
    static boolean[] checked;
    static int count = 0;
    static int n;
    static int m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        
        edge = new int[n+1][n+1];
        checked = new boolean[n+1];
        
        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            edge[a][b] = edge[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }
    static void dfs(int k){
        checked[k] = true;

        for(int i=1;i<=n;i++){
            if(!checked[i] && edge[k][i] == 1){
                count++;
                dfs(i);
            }
        }
    }
}
//bfs방식
//public class _2606 {
//    static int[][] network;
//    static boolean[] visit;
//    static int count = 0;
//    static int n;
//    static int k;
//    public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        k = Integer.parseInt(br.readLine());
//        
//        network = new int[n+1][n+1];
//        visit = new boolean[n+1];
//
//        for(int i=0;i<k;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            network[a][b] = network[b][a] = 1;
//        }
//        
//        bfs();
//        
//        System.out.println(count);
//    }
//    static void bfs(){
//        LinkedList<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        visit[1] = true;
//        
//        while(!queue.isEmpty()){
//            int m = queue.poll();
//            for(int i=1;i<=n;i++){
//                if(network[m][i]==1 && !visit[i]){
//                    visit[i] = true;
//                    queue.add(i);
//                    count++;
//                }
//            }
//        }
//    }
//}