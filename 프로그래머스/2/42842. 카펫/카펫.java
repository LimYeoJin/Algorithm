import java.lang.Math;
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int x =0,y=0;
        
        for(int i=1;i<=Math.sqrt(yellow);i++) {
            if(yellow%i == 0) {
                 y = yellow/i;
                 x = ((y+2)*2) + ((yellow/y)*2);    
            }
            
            if(x == brown && y+2 >= i+2) {
                answer = new int[]{(y+2), ((yellow/y)+2)};
                break;
            }
        }
        return answer;
    }
}