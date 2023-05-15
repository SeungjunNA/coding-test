class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        int prev = 0;
        for(int n : numLog){
            if(prev-n==-1) answer += "w";
            else if(prev-n==1) answer +="s";
            else if(prev-n==-10) answer += "d";
            else if(prev-n==10) answer += "a";
            prev = n;
        }   
        return answer;
    }
}