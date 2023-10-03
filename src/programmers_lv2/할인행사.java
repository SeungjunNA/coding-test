package programmers_lv2;

import java.util.*;
class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<discount.length-9;i++){
            for(int j=0;j<want.length;j++){
                map.put(want[j],number[j]);
            }
            for(int j=i;j<i+10;j++){
                if(map.containsKey(discount[j])){
                    int num = map.get(discount[j])-1;
                    if(num<=0) map.remove(discount[j]);
                    else map.put(discount[j],num);
                }
            }
            if(map.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}
