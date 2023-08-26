package baekjoon;

//bfs
import java.util.*;
import java.io.*;
public class _11725 {
    static int N;
    static List<Integer>[] list;
    static boolean[] visit;
    static int[] parent;
    static LinkedList<Integer> queue;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        list = new ArrayList[N+1];
        visit = new boolean[N+1];
        parent = new int[N+1];
        for(int i=0;i<=N;i++){
            list[i] = new ArrayList<>();
        }
        
        for(int i=0;i<N-1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            list[a].add(b);
            list[b].add(a);
        }
        
        bfs(1);
        
        for(int i=2;i<=N;i++){
            System.out.println(parent[i]);
        }
    }
    static void bfs(int i){
        queue = new LinkedList<>();
        queue.add(i);
        visit[i] = true;
        
        while(!queue.isEmpty()){
            int n = queue.poll();
            for(int k:list[n]){
                if(!visit[k]){
                    visit[k] = true;
                    queue.add(k);
                    parent[k] = n;
                }
            }
        }
    }
}
