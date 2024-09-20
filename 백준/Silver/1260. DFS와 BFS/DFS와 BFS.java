import java.util.*;

public class Main {
  static boolean[] visited ;
  static boolean[][] graph;
  static Queue<Integer> queue;
  private static void dfs(int start) {
    visited[start] = true;
    System.out.print(start + " ");
    
    for(int i=1;i<visited.length;i++){
      if(graph[start][i] && !visited[i]) {
        dfs(i);
      }
    }
  }

  private static void bfs() {
    int start  = queue.poll();
    System.out.print(start + " ");
    
    for(int i=1;i<visited.length;i++) {
      if(graph[start][i] && !visited[i]) {
        visited[i] = true;
        queue.offer(i);
      }
    }
    if(!queue.isEmpty())
      bfs();
  }
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int V = sc.nextInt();

    visited = new boolean[N+1];
    
    graph = new boolean[N+1][N+1];
    for(int i=0;i<M;i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      graph[x][y] = graph[y][x] =  true;
    }

    
    
    dfs(V);
    System.out.println();
    visited = new boolean[N+1];
    queue = new LinkedList<Integer>();
    queue.offer(V);
    visited[V] = true;
    bfs();
  }

}