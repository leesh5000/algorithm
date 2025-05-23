import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P20250523_2 {

    public int solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i<=n; i++) q.offer(i);
        while (q.size() != 1) {
            for (int i=1; i<=k; i++) {
                int x = q.poll();
                if (i!=k) {
                    q.offer(x);
                }
            }
        }
        return q.poll();
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250523_2 P = new P20250523_2();
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.print(P.solution(n,k));
        return ;
    }
}