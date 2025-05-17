import java.util.Scanner;

public class P20250517_2 {

    public int solution(int n, int k, int[] a) {
        int lt=0, cnt=0, answer=0;
        for (int rt=0; rt<n; rt++) {
            if (a[rt]==0) cnt++;
            while (cnt>k) {
                if (a[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250517_2 P = new P20250517_2();
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        System.out.print(P.solution(n,k,a));
        return ;
    }
}