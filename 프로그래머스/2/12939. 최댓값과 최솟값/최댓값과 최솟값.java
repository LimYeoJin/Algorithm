import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] str = s.split(" ");
        
        
        for(int i=0;i<str.length;i++) {
            int number = Integer.parseInt(str[i]);
            
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        
        return min + " " + max;
    }
}