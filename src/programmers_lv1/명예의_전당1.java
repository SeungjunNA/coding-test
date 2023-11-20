package programmers_lv1;

import java.util.*;
class 명예의_전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(list.size()<k){
                list.add(score[i]);
                Collections.sort(list);
            }else{
                if(list.get(0)<score[i]){
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
            }
            answer[i] = list.get(0);
        }
        return answer;
    }
} 