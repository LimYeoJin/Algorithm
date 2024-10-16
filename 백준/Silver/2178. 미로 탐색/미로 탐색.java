import java.util.*;
import java.io.*;
import java.awt.Point;

public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dX = {-1,1,0,0};
    static int[] dY = {0,0,-1,1};

    static int N, M;
    static int[][] answer;
    static String str;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        N = Integer.parseInt(str.split(" ")[0]);
        M = Integer.parseInt(str.split(" ")[1]);

        graph = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for(int i=1;i<=N;i++){
            str = br.readLine();
            for(int j=1;j<=M;j++) {
                graph[i][j] = Integer.parseInt(str.split("")[j-1]);
            }
        }


        
        bfs(1,1);
        System.out.println(graph[N][M]);
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            Point currentPoint = queue.poll();

            for(int i=0;i<4;i++) {
                int nextX = dX[i] + currentPoint.x;
                int nextY = dY[i] + currentPoint.y;
    
                if(0<nextX&&nextX<=N && 0<nextY&&nextY<=M
                && !visited[nextX][nextY] && graph[nextX][nextY] == 1) {
    
                    queue.offer(new Point(nextX, nextY));
                    graph[nextX][nextY] = graph[currentPoint.x][currentPoint.y] +1;
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
