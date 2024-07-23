class Solution {
    public String solution(String my_string) {
        String letter = "aeoui";
        for(char c : letter.toCharArray()) {
            my_string = my_string.replace(String.valueOf(c), "");
        }
        return my_string;
    }
}