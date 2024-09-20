import java.util.*;
import java.io.*;

public class Main {
  static int N;
  static int[][] graph;
  static boolean[][] visited;
  static int[] dr;
  static int[] dc;
  static ArrayList<Integer> countPerDanji;
  static int kk;
  
  private static void dfs(int cur_r, int cur_c) {
    kk++;
    visited[cur_r][cur_c] = true;
    for(int i=0;i<4;i++) {
      int next_r = cur_r + dr[i];
      int next_c = cur_c + dc[i];
      if(0<=next_r&&next_r<N && 0<=next_c&&next_c<N
        && graph[next_r][next_c] == 1 && !visited[next_r][next_c]) {
        dfs(next_r, next_c);
        }
    }
  }
  
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      N = Integer.parseInt(br.readLine());

      graph = new int[N][N];
      visited = new boolean[N][N];
      countPerDanji = new ArrayList<Integer>();
      dr = new int[]{-1,1,0,0};
      dc = new int[]{0,0,-1,1};

      
      for(int i=0;i<N;i++) {
        String str = br.readLine();
        for(int j=0;j<N;j++) {
          graph[i][j] = str.charAt(j)-'0';
        }
      }
    } catch (IOException e) {
      System.err.println("Error reading input: " + e.getMessage());
      System.exit(1);
    }

    
    for(int i=0;i<N;i++) {
      for(int j=0;j<N;j++) {
        if(graph[i][j] == 1 && !visited[i][j]) {
          kk = 0;
          dfs(i,j);
          countPerDanji.add(kk);  
        }
      }
    }
    
    System.out.println(countPerDanji.size());
    Collections.sort(countPerDanji);
    for(int i : countPerDanji) {
      System.out.println(i);
    }
  }
}
  
