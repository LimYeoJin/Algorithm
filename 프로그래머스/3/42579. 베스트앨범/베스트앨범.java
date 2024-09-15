import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 1. 제일 플레이가 많이 된 장르 찾기
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<genres.length;i++) {
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }

        List<String> maxGenres = new ArrayList<>(map.keySet());
        maxGenres.sort((o1,o2)->map.get(o2).compareTo(map.get(o1)));

        for(int i=0;i<map.size();i++) {
            HashMap<Integer, Integer> map2 = new HashMap<>();
        
            for(int j=0;j<genres.length;j++) {
                if (genres[j].equals(maxGenres.get(i))) {
                    map2.put(j, plays[j]);
                }
            }

            List<Integer> maxPlays = new ArrayList<>(map2.keySet());
            maxPlays.sort((o1,o2)->map2.get(o2).compareTo(map2.get(o1)));

            answer.add(maxPlays.get(0));
            if(maxPlays.size() != 1) {
                answer.add(maxPlays.get(1));
            }
            
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}