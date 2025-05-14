import java.util.Scanner;

public class P20250514_1 {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                int cnt = 0;
                for (int k=0; k<m; k++) {
                    int pi= 0, pj = 0;
                    for (int l=0; l<n; l++) {
                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250514_1 P = new P20250514_1();
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(P.solution(n, m, arr));
        return ;
    }
}