import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");

        ArrayList<String> list = new ArrayList<String>();
        for(String s : str){
            if(!s.equals(""))
                list.add(s);
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i] = list.get(i);
        return answer;
    }
}