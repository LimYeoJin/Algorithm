import java.util.*;
import java.io.*;

public class Main {
  static int N, M, max;
  static ArrayList<ArrayList<Integer>> graph;
  static boolean[] visited;
  static int[] count;
  static Queue<Integer> queue;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    graph = new ArrayList<ArrayList<Integer>>(N+1);
    count = new int[N+1];
    queue = new LinkedList<Integer>();
    max = 0;
    
    for(int i=0;i<=N;i++) {
      graph.add(new ArrayList<Integer>());
    }

    for(int i=0;i<M;i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      graph.get(y).add(x);
    }


    for(int i=1;i<=N;i++) {
      visited = new boolean[N+1];

      if(!visited[i]) {
        visited[i] = true;
        count[i] = 1;
        queue.offer(i);

        while(!queue.isEmpty()) {
          int tmp = queue.poll();
          for(int k=0;k<graph.get(tmp).size();k++) {
            int q = graph.get(tmp).get(k);
              if(!visited[q]) {
                queue.offer(q);
                visited[q] = true;
                count[i]++;
            }
          }
          max = Math.max(max, count[i]);;
        }
      }
    }
    

    for(int i=1;i<=N;i++) {
      if(max == count[i]) System.out.print(i + " ");
    }
    br.close();
  }
}