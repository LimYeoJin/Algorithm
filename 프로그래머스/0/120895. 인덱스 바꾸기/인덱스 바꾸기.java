class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char char1 = my_string.toCharArray()[num1];
        char char2 = my_string.toCharArray()[num2];
        for(int i=0;i<my_string.length();i++){
            if(num1 == i) {
                answer+=char2;
            }else if(num2 == i) {
                answer+=char1;
            }else {
                answer += my_string.toCharArray()[i];
            }
        }
        return answer;
    }
}