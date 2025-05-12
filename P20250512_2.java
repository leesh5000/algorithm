import java.util.Scanner;

public class P20250512_2 {

    public int solution(int n, int[] a) {
        int cnt = 0;
        int sum = 0;
        for (int x : a) {
            if (x==1) cnt++;
            else cnt = 0;
            sum += cnt;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250512_2 P = new P20250512_2();
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(P.solution(n, a));
        return ;
    }
}