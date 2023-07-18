package programmers_lv2;

import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push('(');
            else{
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }else stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = false;

        return answer;
    }
}