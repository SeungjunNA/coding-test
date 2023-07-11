package programmers_lv2;
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int n : priorities){
            pq.add(n);
        }
        while(true){
            for(int i=0;i<priorities.length;i++){
                if(priorities[i]==pq.peek()){
                    if(i==location)
                        return answer+1;
                    else{
                        answer++;
                        pq.poll();
                    }
                }
            }
            if(pq.isEmpty()) break;
        }
        return answer;
    }
}