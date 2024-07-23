class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for(char c : my_string.toCharArray()) {
            answer += (int)c-'0';
        }
        return answer;
    }
}