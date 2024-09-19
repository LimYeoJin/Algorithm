import java.util.*;


class Solution {

    static int[][] computers;
    static int answer;
    static boolean[] visited;
    static Queue<Integer> queue;
    
    public int solution(int n, int[][] computers) {
        answer = 0;
        this.computers = computers;
        
        visited = new boolean[n];
        queue = new LinkedList<>();
        
        
        for (int i=0;i<n;i++) {
            if(!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    static void bfs(int cur) {
        visited[cur] = true;
        queue.add(cur);
        
        while(!queue.isEmpty()) {
            int w = queue.poll();
            for(int i=0;i<computers.length;i++) {
                if(!visited[i] && computers[w][i] == 1) {
                    bfs(i);
                    queue.add(i);
                }
            }
        }
    }
}