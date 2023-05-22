class Solution {
    public String solution(String n_str) {
        String answer = "";
        int n = 0;
        for(int i=0;i<n_str.length();i++){
            if(n_str.charAt(i)!='0'){
                n=i; 
                break;
            }
        }
        answer = n_str.substring(n);
        return answer;
        
//        answer = Integer.valueOf(n_str)+"";
//        return answer;
    }
}