import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P20250514_2 {

    public List<Integer> solution(int n, int[] a, int m, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] <= b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250514_2 P = new P20250514_2();

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();

        int m = in.nextInt();
        int[] b = new int[m];

        for (int i=0; i<m; i++) b[i] = in.nextInt();
        for (int x : P.solution(n, a, m, b)) {
            System.out.print(x + " ");
        }
    }
}