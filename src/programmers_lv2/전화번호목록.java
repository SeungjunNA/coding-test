package programmers_lv2;

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> set = new HashSet<String>();
        for(String s:phone_book) set.add(s);
        
        for(String s:set){
            for(int i=0;i<s.length();i++){
                if(set.contains(s.substring(0,i)))
                    answer = false;
            }
        }
        return answer;
    }
}