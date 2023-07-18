package programmers_lv2;

import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        LinkedList<Integer> truck = new LinkedList<Integer>();
        LinkedList<Integer> bridge = new LinkedList<Integer>();
        
        for(int i=0;i<bridge_length;i++) bridge.add(0);
        for(int i=0;i<truck_weights.length;i++) truck.add(truck_weights[i]);
        
        while(!truck.isEmpty()){
            sum -= bridge.poll();
            if(sum + truck.peek()<=weight){
                sum += truck.peek();
                bridge.add(truck.poll());
            }else bridge.add(0);
            answer++;
        }
        answer += bridge_length;
        return answer;
    }
}
