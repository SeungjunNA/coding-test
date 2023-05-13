class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        
        for(int i=0, j=start;j<=end;i++,j++){
            answer[i] = j;
        }
        return answer;
    }
}