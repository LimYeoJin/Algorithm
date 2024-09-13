import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //1. 두 배열을 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        //2. 두 배열이 다를 때까지 찾는다.
        int i =0;
        for (;i<completion.length;i++) {
            if (!participant[i].equals(completion[i])) {
                break;
                }
        }
        return participant[i];
    }
}