class Solution {
    public int[] solution(long n) {
        String nn = String.valueOf(n);
        int[] answer = new int[nn.length()];
        
        int k = 0;
        
        for(int i=nn.length();i>0;i--) {
            answer[k++] = nn.charAt(i-1) - 48;
        }
        return answer;
    }
}