class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        
        if(str[1].equals("+")){
            answer = Integer.valueOf(str[0]) + Integer.valueOf(str[2]);
        }else if(str[1].equals("-")){
            answer = Integer.valueOf(str[0]) - Integer.valueOf(str[2]);
        }else{
            answer = Integer.valueOf(str[0]) * Integer.valueOf(str[2]);
        }
        return answer;
    }
}