import java.util.Scanner;
import java.util.Stack;

public class P20250522_1 {

    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int x : moves) {
            for (int i=0; i<n; i++) {
                if (board[i][x-1] != 0) {
                    int tmp = board[i][x-1];
                    board[i][x-1] = 0;
                    if (!st.isEmpty() && st.peek()==tmp) {
                        st.pop();
                        answer+=2;
                    } else {
                        st.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250522_1 P = new P20250522_1();
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++) {
            moves[i] = in.nextInt();
        }
        System.out.print(P.solution(n, board, m, moves));
        return ;
    }
}