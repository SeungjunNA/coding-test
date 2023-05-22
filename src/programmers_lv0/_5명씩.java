class Solution {
    public String[] solution(String[] names) {
        int len = names.length%5>0 ? names.length/5+1 : names.length/5;
        String[] answer = new String[len];
        for(int i=0,j=0;i<answer.length;i++,j+=5)
            answer[i] = names[j];
        return answer;
    }
}