import java.util.*;

public class P20250527_1 {

    public int count(int[] a, int capacity) {
        int cnt=1;
        int sum=0;
        for (int x : a) {
            if (sum+x>capacity) {
                cnt++;
                sum=x;
            } else {
                sum+=x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] a) {
        int lt=0;
        int rt=0;
        for (int i=0; i<n; i++) {
            lt = Math.max(a[i], lt);
            rt += a[i];
        }
        int answer = 0;
        while (lt<=rt) {
            int mid = (lt+rt)/2;
            if (count(a, mid)<=m) {
                answer = mid;
                rt=mid-1;
            } else {
                lt=mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250527_1 P = new P20250527_1();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        System.out.print(P.solution(n,m,a));
        return ;
    }
}