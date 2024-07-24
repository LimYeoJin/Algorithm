import java.util.*;

class Solution {
    public int solution(int[] order) {
        
        int count = 0;
        int idx = 0;
        Stack<Integer> assistance = new Stack<>();
        
        for(int box = 1;box<=order.length;box++) {
            if(order[idx] != box) {
                assistance.add(box);
                continue;
            }
            
            count++;
            idx++;
            
            
            while (assistance.size() != 0 && order[idx] == assistance.peek()) {
                assistance.pop();
                count++;
                idx++;
            }
        }
        
        return count;
    }
}