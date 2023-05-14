class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int total = 1;
        
        for(int i=0;i<num_list.length;i++){
            sum += num_list[i];
            total *= num_list[i];
        }
        if(Math.pow(sum,2)>total) return 1;
        
        return answer;
    }
}