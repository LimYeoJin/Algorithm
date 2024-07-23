class Solution {
    public int solution(int hp) {
        int answer = hp/5;
        hp = hp%5;
         
        if(hp>0) {
            answer += hp/3;
            hp = hp%3;
            answer += hp/1;
        }
        return answer;
    }
}