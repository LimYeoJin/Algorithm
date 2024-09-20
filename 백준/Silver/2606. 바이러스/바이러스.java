import java.util.*;

public class Main {
  static boolean[] visited;
  static boolean[][] graph;
  static int answer;
  static int N, M;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt(); //컴퓨터대수
    M = sc.nextInt();  //컴퓨터쌍의 수


    graph = new boolean[N+1][N+1];
    visited = new boolean[N+1];
    answer = 0;
    
    for(int i=0;i<M;i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      graph[x][y] = graph[y][x] = true;
    }

    dfs(1);
    System.out.println(answer);
  }

  private static void dfs(int start) {
    visited[start] = true;
    for(int i=1;i<=N;i++) {
      if(graph[start][i] && !visited[i]) {
          answer++;
          dfs(i);
      }
    }
  }

}