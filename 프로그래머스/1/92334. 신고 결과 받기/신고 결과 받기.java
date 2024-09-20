
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,ArrayList<String>> reporterList = new HashMap<>();
        HashMap<String,Integer> count = new HashMap<>();
        int[] answer = new int[id_list.length];
        
        for(int i=0;i<id_list.length;i++) {
            reporterList.put(id_list[i], new ArrayList<>());
        }
        
        for(int i=0;i<report.length;i++) {
            String[] reported = report[i].split(" ");
            ArrayList<String> reportedList = reporterList.get(reported[0]);
            if(!reportedList.contains(reported[1])) {
                reportedList.add(reported[1]);
                reporterList.put(reported[0], reportedList);   
                count.put(reported[1], count.getOrDefault(reported[1], 0)+1);
            }
            
        }
        
        for(String s: id_list) {
            if(count.get(s) != null && count.get(s)>= k) {
                for(int i=0;i<id_list.length;i++) {
                    if(reporterList.get(id_list[i]).contains(s)){
                    answer[i]++;
                    }
                } 
            }
        }
        
        
        

        
        return answer;
    }
}