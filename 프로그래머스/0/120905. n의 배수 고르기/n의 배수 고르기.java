class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int listIndex = 0;
        for(int i=0;i<numlist.length;i++) {
            if(numlist[i]%n == 0 ) {
                listIndex++;
            }
        }
        int[] answer = new int[listIndex];
        int initIndex = 0;
        for(int i=0;i<numlist.length;i++){
            if (numlist[i]%n == 0 ){
                answer[initIndex++] = numlist[i];
            }
        }
        return answer;
    }
}