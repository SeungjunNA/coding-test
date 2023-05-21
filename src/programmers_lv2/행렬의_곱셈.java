class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int len1 = answer.length;
        int len2 = answer[0].length;
        
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                for(int k=0;k<arr1[0].length;k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        return answer;
    }
}