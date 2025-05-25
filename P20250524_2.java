import java.util.Scanner;

public class P20250524_2 {

    public int[] solution(int s, int n, int[] a) {
        int[] cache = new int[s];
        for (int x : a) {
            int pos = -1;
            for (int i=0; i<s; i++) {
                if (x==cache[i]) pos = i;
            }
            if (pos!=-1) {
                for (int i=pos; i>0; i--) {
                    if (cache[i-1]!=0) cache[i]=cache[i-1];
                }
                cache[0] = x;
            } else {
                for (int i=s-1; i>0; i--) {
                    if (cache[i-1]!=0) cache[i]=cache[i-1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250524_2 P = new P20250524_2();
        int s = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        for (int x : P.solution(s,n,a)) {
            System.out.print(x + " ");
        }
        return ;
    }
}