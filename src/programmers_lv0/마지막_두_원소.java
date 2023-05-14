class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        for(int i=0;i<num_list.length;i++){
            answer[i] = num_list[i];
        }
        int len = answer.length-1;
        answer[len] = answer[len-1]>answer[len-2] ? answer[len-1]-answer[len-2] : answer[len-1]*2;
        return answer;
    }
}