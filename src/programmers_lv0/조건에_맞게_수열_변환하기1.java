class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int i=0;
        for(int n : arr){
            if(n>=50 && n%2==0) answer[i++] = n/2;
            else if(n<50 && n%2==1) answer[i++] = n*2;
            else answer[i++] = n;
        }
        return answer;
    }
}