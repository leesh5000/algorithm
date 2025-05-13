import java.util.Scanner;

public class P20250513_1 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for (int i=0; i<n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250513_1 P = new P20250513_1();
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