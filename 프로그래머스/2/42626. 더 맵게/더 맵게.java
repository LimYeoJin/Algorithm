import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer=0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i=0;i<scoville.length;i++) {
            heap.offer(scoville[i]);
        } 
        
    
        while (heap.peek() < K ){
            int min = heap.poll();
            if(heap.size() >=1) {
                int nextMin = heap.poll();
                heap.offer(min+(nextMin*2));
                answer++;
            }else {
                return -1;
            }
        }
    
        return answer ;
    }
}