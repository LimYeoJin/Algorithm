import java.util.*;

public class Main {
  static int[][] graph;
  static boolean[][] visited;


  
  static int[] dr;
  static int[] dc;
  static int N ;
  static int answer;
  
  private static void bfs(int cur_r, int cur_c, int start) {
    
    for(int i=0;i<4;i++) {
        int next_r = dr[i] + cur_r;
        int next_c = dc[i] + cur_c;
        if(0<=next_r&&next_r<N && 0<=next_c&&next_c<N
          && graph[next_r][next_c] > start 
          && !visited[next_r][next_c]){
            visited[next_r][next_c] = true;
            bfs(next_r, next_c, start);
          }
      } 
    }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    graph = new int[N][N];
    dr = new int[]{-1, 1, 0 ,0};
    dc = new int[]{0, 0, -1, 1};

    answer = 0;
    
    for(int i=0;i<N;i++) {
      for(int j=0;j<N;j++) {
        graph[i][j] = sc.nextInt();
      }
    }

    
    int max = 1;
    for(int start = 0;start<=100;start++) {
      visited = new boolean[N][N];
      answer = 0;
      for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(graph[i][j] > start && !visited[i][j]) {
              bfs(i, j, start);
              answer++;
            }
          }
        }
      max = Math.max(max,answer);
    }

    
    System.out.println(max);
    sc.close();
  }
}
  
