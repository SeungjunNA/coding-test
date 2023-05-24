import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        for(int i=0;i<delete_list.length;i++){
            if(list.remove(new Integer(delete_list[i])));
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}