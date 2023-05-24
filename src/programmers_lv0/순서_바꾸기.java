import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<num_list.length;i++)
            q.add(num_list[i]);
        
        for(int i=0;i<n;i++){
            q.poll();
            q.offer(num_list[i]);
        }
        Iterator it = q.iterator();
        int i=0;
        while(it.hasNext()){
            answer[i++] = (int)it.next();
        }
        return answer;
    }
}