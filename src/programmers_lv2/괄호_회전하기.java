package programmers_lv2;

import java.util.*;
class 괄호_회전하기 {
    public int solution(String s) {
        int count = 0;
        for(int i=1;i<=s.length();i++){
            String newStr = s;
            for(int j=0;j<i;j++){
                newStr = newStr.substring(1) + newStr.charAt(0);
            }
            Stack<Character> stack = new Stack<>();
            for(int j=0;j<s.length();j++){
                char c = newStr.charAt(j);
                if(stack.isEmpty()){
                    stack.add(c);
                }else if(c==')' && stack.peek()=='('){
                    stack.pop();
                }else if(c=='}' && stack.peek()=='{'){
                    stack.pop();
                }else if(c==']' && stack.peek()=='['){
                    stack.pop();
                }else if(c=='(' || c=='{' || c=='['){
                    stack.add(c);
                }
            }
            if(stack.isEmpty()) count++;
        }
        return count;
    }
}