import java.util.*;


class Solution {
    static int[][] maps;
    static int answer;
    
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
            
    
    public int solution(int[][] maps) {
        answer = 0;
        this.maps = maps;
        
        int row = maps.length;
        int col = maps[0].length;
        
        if(maps[0][0] != 1 || maps[row-1][col-1] != 1) return -1;
        
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1});
    
        boolean[][] visited = new boolean[row][col];
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cur_r = cur[0], cur_c = cur[1], cur_len = cur[2];
            
            if (cur_r == row-1 && cur_c == col-1) 
                return cur_len;
            
            for(int i=0;i<4;i++) {
                int next_r = cur_r + dr[i];
                int next_c = cur_c + dc[i];
                
                if(0<=next_r&&next_r<row && 0<=next_c&&next_c<col && !visited[next_r][next_c]
                  && maps[next_r][next_c] == 1) {
                    queue.add(new int[]{next_r, next_c, cur_len+1});
                    visited[next_r][next_c] = true;
                }
            }
        }
        
        
        return -1;
    }
}