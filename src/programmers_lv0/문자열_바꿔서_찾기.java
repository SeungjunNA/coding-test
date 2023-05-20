class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.replace("A","b");
        str = str.replace("B","a");
        
        if(str.toUpperCase().contains(pat)) answer = 1;
        return answer;
    }
}