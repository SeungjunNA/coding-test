class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0;
        for(int i=0;i<todo_list.length;i++)
            if(!finished[i]) len++;
        
        String[] answer = new String[len];
        for(int i =0,j=0;i<todo_list.length;i++)
            if(!finished[i]) answer[j++] = todo_list[i];
        return answer;
    }
}