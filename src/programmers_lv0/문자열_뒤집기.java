class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s,e+1);
        answer += my_string.substring(0,s);
        for(int i=str.length()-1;i>=0;i--)
            answer += str.charAt(i);
        answer += my_string.substring(e+1);
        return answer;
    }
}	