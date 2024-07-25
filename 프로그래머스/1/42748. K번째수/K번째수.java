import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        

        for(int c=0;c<commands.length;c++) {
            
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            int[] arr = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(arr);
            answer.add(arr[k-1]);
        }
                
        return answer.stream().mapToInt(i->i).toArray();
    }
}