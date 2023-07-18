package programmers_lv2;

import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<prices.length;i++){
            stack.push(prices[i]);
            int count = 0;
            for(int j=i;j<prices.length-1;j++){
                if(stack.peek()<=prices[j]) count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}

//import java.util.*;
//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//
//        Stack<Integer> stack = new Stack<Integer>();
//        for(int i=0;i<prices.length;i++){
//            int count = 0;
//            boolean flag = true;
//            for(int j=i;j<prices.length;j++){
//                if(prices[i]<=prices[j]){
//                    count++;    
//                } 
//                else{
//                    flag = false;
//                    count = j - i;
//                    break;    
//                } 
//            }
//            if(flag){
//                count -= 1;
//            }
//            stack.push(count);
//        }
//        for(int i=0;i<stack.size();i++){
//            answer[i] = stack.get(i);
//        }
//        return answer;
//    }
//}