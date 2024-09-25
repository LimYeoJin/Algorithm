import java.util.*;
import java.io.*;

public class Main {
  static int[][] graph;
  static int[] dirX = {0,0,-1,1,-1,1,-1,1};
  static int[] dirY = {-1,1,0,0,1,1,-1,-1};
  static boolean[][] visited;

  static int w, h;


  private static void dfs(int x, int y){
    visited[x][y] = true;
    for(int i=0;i<8;i++) {
      int next_x = x + dirX[i];
      int next_y = y + dirY[i];

      if(0<=next_x&&next_x<h && 0<=next_y&&next_y<w 
         && !visited[next_x][next_y] && graph[next_x][next_y]==1){
            dfs(next_x, next_y);
         }
      
    }
  }
  
  public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st ;

    String str = " ";
    while(!(str = br.readLine()).equals("0 0")) {
      st = new StringTokenizer(str);
      w = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());

      graph = new int[h][w];
      visited = new boolean[h][w];
      for(int i=0;i<h;i++) {
        st = new StringTokenizer(br.readLine());
        for(int j=0;j<w;j++) {
          graph[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      int count = 0;
      for(int i=0;i<h;i++) {
        for(int j=0;j<w;j++) {
          if(!visited[i][j] && graph[i][j] == 1) {
            count++;
            dfs(i,j);
          }
        }
      }
      System.out.println(count);
    }
    br.close();
  }
}
  
