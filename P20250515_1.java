import java.util.*;

public class P20250515_1 {

    public List<Integer> solution(int n, int[] a, int m, int[] b) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0;
        int p2=0;
        while (p1<n && p2<m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250515_1 P = new P20250515_1();

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];
        for (int j=0; j<m; j++) {
            b[j] = in.nextInt();
        }

        for (int x : P.solution(n, a, m, b)) {
            System.out.print(x + " ");
        }
        return ;
    }
}