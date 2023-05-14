class Solution {
    public int solution(int a, int b, int c) {
        int answer = a+b+c;
        int same = a==b ? (b==c ? 3:2) : (a==c ? 2 : (b==c ? 2:1));
        
        if(same == 2){
            answer *= (Math.pow(a,2))+(Math.pow(b,2))+(Math.pow(c,2));
        }else if(same == 3){
            answer *= (Math.pow(a,2))+(Math.pow(b,2))+(Math.pow(c,2));
            answer *= (Math.pow(a,3))+(Math.pow(b,3))+(Math.pow(c,3));
        }
        return answer;
    }
}