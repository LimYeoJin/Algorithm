import java.util.*;

public class Main {
    static int N, M;
    static String[][] graph;
    static int[] dx= {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static boolean[][] visited;
    static int startX, startY;;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        graph = new String[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++) {
            String str = sc.next();
            for(int j=0;j<M;j++) {
                if(str.charAt(j) == 'I') {
                    startX = i;
                    startY = j;
                }
                graph[i][j] = String.valueOf(str.charAt(j));
            }
        }
        
        dfs(startX, startY);
        if(answer == 0) {
            System.out.println("TT");
        }
        else {
            System.out.println(answer);
        }
    }


    //재귀
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(0<=nextX&&nextX<N && 0<=nextY&&nextY<M 
            && !visited[nextX][nextY] && !graph[nextX][nextY].equals("X")) {
                if(graph[nextX][nextY].equals("P")) {
                    answer++;
                }
                dfs(nextX, nextY);

            }
        }        
    }
}
