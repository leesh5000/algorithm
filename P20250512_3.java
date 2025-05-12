import java.util.Scanner;

public class P20250512_3 {

    public int[] solution(int n, int[] a) {
        int[] ch = new int[n];
        for (int i=0; i<n; i++) {
            int cnt = 1;
            for (int j=0; j<n; j++) {
                if (a[i] < a[j]) cnt++;
                ch[i] = cnt;
            }
        }
        return ch;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250512_3 P = new P20250512_3();
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for (int x : P.solution(n, a)) {
            System.out.print(x + " ");
        }
        return ;
    }
}