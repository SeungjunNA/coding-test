class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        int[] answer;
        if(myString.charAt(myString.length()-1)=='x')
            answer = new int[strArr.length+1];
        else answer = new int[strArr.length];
        
        for(int i=0;i<strArr.length;i++){
            answer[i] = strArr[i].length();
        }
        return answer;
    }
}