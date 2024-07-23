import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = (n%2 == 0) ? new int[n/2] : new int[n/2+1];
        int initIndex = 0;
        for (int i=1;i<=n;i++) {
            if (i %2 != 0) {
                answer[initIndex++] = i;
            }
        }
        return answer;
    }
}