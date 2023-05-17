class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int k : num_list){
            if(k==n) return 1;
        }
        return answer;
    }
}