class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        for(int i=0,j=n-1;i<answer.length;i++,j++){
            answer[i] = num_list[j];
        }
        return answer;
    }
}
//import java.util.*;
//class Solution {
//    public int[] solution(int[] num_list, int n) {
//        return Arrays.copyOfRange(num_list,n-1);
//    }
//}