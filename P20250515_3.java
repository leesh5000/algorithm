import java.util.Scanner;

public class P20250515_3 {

    public int solution(int n, int m, int[] a) {
        int answer = 0;
        int lt=0, sum=0;
        for (int rt=0; rt<n; rt++) {
            sum += a[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= a[lt++];
                if (sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250515_3 P = new P20250515_3();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        System.out.print(P.solution(n, m, a));
        return ;
    }
}