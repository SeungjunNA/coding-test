package programmers_lv2;

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] dayArr = new int[progresses.length];
        
        for(int i=0;i<progresses.length;i++){
            int day = 1;
            while(progresses[i]+speeds[i]*day<100){
                day++;
            }
            dayArr[i] = day;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        int k = 1;
        int min = 0;
        for(int i=0;i<dayArr.length;i++){
            if(stack.isEmpty()){
                stack.push(k);
                min = dayArr[i];
            } 
            else{
                if(min>=dayArr[i]){
                    stack.push(stack.pop()+1);
                }else{
                    k = 1;
                    stack.push(k);
                    min = dayArr[i];
                }
            }
        }
        
        answer = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}