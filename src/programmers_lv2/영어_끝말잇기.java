import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int i = 0;
        Set set = new HashSet();

        char prev = words[0].charAt(0);
        for(String str : words){
            if(!(set.contains(str)) && prev==str.charAt(0)){
                i++;
                set.add(str);
                prev = str.charAt(str.length()-1);
            }
            else break;
        }

        if(set.size()!=words.length){
            answer[0] = i%n+1;
            if(i%n!=0)
                answer[1] = i/n+1;
            else
                answer[1] = i/n+1;
        }
        return answer;
    }
}