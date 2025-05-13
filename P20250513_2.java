import java.util.Scanner;

public class P20250513_2 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean flag = true;
                for (int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250513_2 P = new P20250513_2();
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(P.solution(n, arr));
        return ;
    }
}