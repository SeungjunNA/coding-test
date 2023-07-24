package programmers_lv1;

import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        answer = nums.length/2 < set.size() ? nums.length/2 : set.size();
        return answer;
    }
}