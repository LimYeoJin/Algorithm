import java.util.*;
import java.io.*;

public class Main {
  static int N, M, K, count, max;
  static int[] dr = {-1,1,0,0};
  static int[] dc = {0,0,-1,1};
  static boolean[][] visited;
  static boolean[][] graph;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());

    visited = new boolean[N+1][M+1];
    graph = new boolean[N+1][M+1];
    max =0;
    
    for(int i=0;i<K;i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      graph[x][y] = true;
    }

    for(int i=1;i<=N;i++) {
      for(int j=1;j<=M;j++) {
        if(!visited[i][j] && graph[i][j]) {
          count = 1;
          dfs(i,j);
          max = Math.max(count, max);
        }
      }
    }
    
    System.out.println(max);
    br.close();
  }

  private static void dfs(int r, int c) {
    visited[r][c] =true;
    for(int i=0;i<4;i++) {
      int next_r = r + dr[i];
      int next_c = c + dc[i];

      if(0<next_r&&next_r<=N && 0<next_c&&next_c<=M
        && !visited[next_r][next_c] && graph[next_r][next_c]) {
        visited[next_r][next_c] = true;
        count++;

        dfs(next_r, next_c);
      }
    }
  } 
}