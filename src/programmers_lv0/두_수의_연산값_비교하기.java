class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        int result1 = Integer.valueOf(s1+s2);
        int result2 = 2 * a * b;
        
        answer = Math.max(result1,result2);
        return answer;
    }
}