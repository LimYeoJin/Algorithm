import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        // box[0]/n * box[1]/n * box[2]/n
        System.out.println((int)Math.floor(box[0]/n) * (int)Math.floor(box[1]/n)
                          * (int)Math.floor(box[2]/n));
        return (int)Math.floor(box[0]/n) * (int)Math.floor(box[1]/n)
                          * (int)Math.floor(box[2]/n);
    }
}