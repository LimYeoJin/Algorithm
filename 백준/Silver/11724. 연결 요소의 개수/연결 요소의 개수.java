import java.util.*;

public class Main {
  static boolean[][] graph;
  static boolean[] visited;
  static int answer;
  static int N;


  private static void dfs(int x) {
    visited[x] = true;
    
    for(int i=1;i<=N;i++) {
      if(graph[x][i] && !visited[i]) {
        dfs(i);
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int M = sc.nextInt();


    graph = new boolean[N+1][N+1];
    visited = new boolean[N+1];

    
    for(int i=0;i<M;i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      graph[x][y] = graph[y][x] = true;
    }

    answer = 0;

    
    for(int i=1;i<=N;i++) {
      for(int j=1;j<=N;j++) {
        if(!visited[i]) {
          dfs(i);
          answer += 1;
        }
      }
    }
    System.out.println(answer);
  }
}
  
