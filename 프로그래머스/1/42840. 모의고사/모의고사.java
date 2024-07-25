import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] studentAnswerCounts = new int[3];
        
        for(int i=0;i<answers.length;i++) {
            if (answers[i] == arr1[i%arr1.length]) {
                studentAnswerCounts[0]++;
            }
            if (answers[i] == arr2[i%arr2.length]) {
                studentAnswerCounts[1]++;
            }
            if (answers[i] == arr3[i%arr3.length]) {
                studentAnswerCounts[2]++;
            }
        }
        
        int max = studentAnswerCounts[0];
        for(int i=0;i<studentAnswerCounts.length;i++) {
            max = (int)Math.max(max,studentAnswerCounts[i]);
        }
        
        for(int i=0;i<studentAnswerCounts.length;i++) {
            if(max == studentAnswerCounts[i]) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}