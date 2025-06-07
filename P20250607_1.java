import java.io.IOException;
import java.util.Scanner;

class P20250607_1 {

    static int N;
    static char[][] BOARD;

    public static void swapCandy(int x, int y, int nx, int ny) {
        char tmp = BOARD[x][y];
        BOARD[x][y] = BOARD[nx][ny];
        BOARD[nx][ny] = tmp;
    }

    public static int eatCandy(int row, int col) {
        int continuousCount = 1;
        int count = 1;
        if (row == -1) {
            for (int i=0; i<N-1; i++) {
                if (BOARD[i][col] == BOARD[i+1][col]) continuousCount = Math.max(continuousCount, ++count);
                else count = 1;
            }
        }
        if (col == -1) {
            for (int i=0; i<N-1; i++) {
                if (BOARD[row][i] == BOARD[row][i+1]) continuousCount = Math.max(continuousCount, ++count);
                else count = 1;
            }
        }
        return continuousCount == 1 ? 0 : continuousCount;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        BOARD = new char[N][N];
        int answer = 0;
        for (int i=0; i<N; i++) BOARD[i] = sc.next().toCharArray();
        int[] dx = {1, 0};
        int[] dy = {0 ,1};
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<2; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx < N && ny < N) {
                        swapCandy(i, j, nx, ny);
                        answer = Math.max(answer, Math.max(Math.max(eatCandy(i, -1), eatCandy(nx, -1)), Math.max(eatCandy(-1, j), eatCandy(-1, ny))));
                        swapCandy(i, j, nx, ny);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}