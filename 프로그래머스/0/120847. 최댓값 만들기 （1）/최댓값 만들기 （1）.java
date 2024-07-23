import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return (int)numbers[len-1]*numbers[len-2];
        
    }
}