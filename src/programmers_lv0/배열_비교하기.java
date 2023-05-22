class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length>arr2.length) return 1;
        else if(arr1.length<arr2.length) return -1;
        else{
            int ar1 = 0;
            int ar2 = 0;
            for(int n : arr1)
                ar1 += n;
            for(int n : arr2)
                ar2 += n;
            answer = ar1>ar2 ? 1 : (ar1<ar2 ? -1:0);
        }
        return answer;
    }
}