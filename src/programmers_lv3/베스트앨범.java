package programmers_lv3;

import java.util.*;
class º£½ºÆ®¾Ù¹ü {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<plays.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        List<String> genresOrder = new ArrayList<>();
        while(!map.isEmpty()){
            int max = -1;
            String str = "";
            for(String s:map.keySet()){
                if(map.get(s)>max){
                    max = map.get(s);
                    str = s;
                }
            }
            map.remove(str);
            genresOrder.add(str);
        }
        
        List<Music> result = new ArrayList<>();
        for(int i=0;i<genresOrder.size();i++){
            List<Music> list = new ArrayList<>();
            for(int j=0;j<genres.length;j++){
                if(genresOrder.get(i).equals(genres[j])){
                    list.add(new Music(genres[j], plays[j], j));
                }
            }
            Collections.sort(list,(o1,o2)->o2.play-o1.play);
            for(int j=0;j<list.size();j++){
                System.out.println(list.get(j).play);
            }
            for(int j=0;j<(list.size()>=2 ? 2:list.size());j++)
                result.add(list.get(j));
        }
        answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i).turn;
        }
        
        return answer;
    }
}
class Music{
    String genre;
    int play;
    int turn;
    public Music(String g, int p, int t){
        this.genre = g;
        this.play = p;
        this.turn = t;
    }
}