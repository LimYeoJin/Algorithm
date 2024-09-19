import java.util.*;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    
    public boolean isPrime(int num) {
        if(num == 0 || num == 1) return false;
        for(int i=2;i<=Math.sqrt(num);i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
    
    public void recursive(String comb, String others) {
        if (!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));
        
        for(int i=0;i<others.length();i++) {
            recursive(comb+others.charAt(i), others.substring(0,i) + others.substring(i+1))   ; 
        }    
    }
    public int solution(String numbers) {
        int answer = 0;
        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);
        // 2. 소수의 개수만 센다.
        Iterator<Integer> it = numberSet.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if(isPrime(num)) {
                answer++;
            }
        }
        // 3. 소수의 개수를 반환한다.
        return answer;
    }
}