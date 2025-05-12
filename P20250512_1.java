import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P20250512_1 {

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public List<Integer> solution(int n, int[] a) {
        List<Integer> answer = new ArrayList<>();
        for (int x : a) {
            int tmp = x;
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250512_1 P = new P20250512_1();
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for (int x : P.solution(n, a)) {
            System.out.print(x + " ");
        }
    }
}