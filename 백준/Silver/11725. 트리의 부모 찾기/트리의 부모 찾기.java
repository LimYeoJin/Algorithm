import java.util.*;

public class Main {
  static ArrayList<ArrayList<Integer>> graph;
  static boolean[] visited;
  static int[] answer;
  static int N;
  
  private static void dfs(int start) {
    visited[start] = true;
    for(int  i : graph.get(start)) {
      if(visited[i])  continue;
      answer[i-2] = start;
      dfs(i);
      }
    }

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();

    graph = new ArrayList<ArrayList<Integer>>();
    answer = new int[N];
    visited = new boolean[N+1];

    for(int i=0;i<N+1;i++) {
      graph.add(new ArrayList<Integer>());
    }
    
    for(int i=0;i<N-1;i++) {
      int m = sc.nextInt();
      int k = sc.nextInt();
      graph.get(m).add(k);
      graph.get(k).add(m);

      
    }

    dfs(1);

    for(int i=0;i<N-1;i++) {
      System.out.println(answer[i]);
    }
    sc.close();
  }
}
  
