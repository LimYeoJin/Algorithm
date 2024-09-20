import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        String nn = String.valueOf(n);
        for(int i=0;i<nn.length();i++) {
            list.add(nn.charAt(i)-'0');
        }
        
        
        Collections.sort(list, (o1,o2) -> o2.compareTo(o1));;
        
        String aa = "";
        for(int i : list) {
            aa += i;
        }
        return Long.parseLong(aa);
    }
}