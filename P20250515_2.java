import java.util.Scanner;

public class P20250515_2 {

    public int solution(int n, int k, int[] a) {
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += a[i];
        }
        int answer = sum;
        for (int i=k; i<n; i++) {
            sum = sum - a[i-k] + a[i];
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250515_2 P = new P20250515_2();

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        System.out.print(P.solution(n, k, a));
        return ;
    }
}