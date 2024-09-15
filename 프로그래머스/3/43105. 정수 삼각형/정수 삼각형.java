class Solution {
    public int solution(int[][] triangle) {
        
        int[][] sumTriangle = triangle;
        
        for(int i=1;i<triangle.length;i++) {
            for(int j=0;j<triangle[i].length;j++) {
                if(j == i){
                    sumTriangle[i][j] = triangle[i-1][j-1] + triangle[i][j];
                }
                else if(j == 0) {
                    sumTriangle[i][j] = triangle[i-1][j] + triangle[i][j];
                }
                else {
                   if ( sumTriangle[i-1][j-1] > sumTriangle[i-1][j] ) {
                       sumTriangle[i][j] = triangle[i][j] + sumTriangle[i-1][j-1];
                   }else {
                       sumTriangle[i][j] = triangle[i][j] + sumTriangle[i-1][j];
                   }
                }
                
            }
        }
        
        int maxValue = sumTriangle[triangle.length-1][0];
        for(int i : sumTriangle[triangle.length-1]) {
            if (maxValue < i) 
                maxValue = i;
        }
        
        return maxValue;
    }
}