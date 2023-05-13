import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        LinkedList<String> list = new LinkedList<>();
        List city = Arrays.asList(cities);
        Iterator it = city.iterator();


        while(it.hasNext()){
            if(list.size()<cacheSize){
                String str = it.next().toString().toLowerCase();
                if(list.contains(str)){
                    answer += 1;
                    list.remove(str);
                    list.add(str);
                }else{
                    answer += 5;
                    list.add(str);
                }
            }else{
                String str = it.next().toString().toLowerCase();
                if(list.contains(str)){
                    answer += 1;
                    list.remove(str);
                    list.add(str);
                }
                else{
                    list.add(str);
                    answer += 5;
                    list.remove(); 
                }
            }
        }
        return answer;
    }
}