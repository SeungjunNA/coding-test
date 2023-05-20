import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];

        Arrays.sort(num_list);
        for(int i=0,j=5;i<answer.length;i++,j++){
            answer[i] = num_list[j];
        }
        return answer;
    }
}