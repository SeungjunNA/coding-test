package programmers_lv2;

import java.util.*;
class ±Ö°í¸£±â {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        int[] arr = new int[10000001];
        for(int i : tangerine){
            arr[i]++;
        }
        Arrays.sort(arr);
        int i = 10000000;
        while(k>0){
            k -= arr[i--];
            answer++;
        }
        return answer;
    }
}