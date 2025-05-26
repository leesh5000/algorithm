import java.util.Arrays;
import java.util.Scanner;

public class P20250526_2 {

    public int solution(int n, int m, int[] a) {
        int answer = 0;
        Arrays.sort(a);
        int lt=0;
        int rt=n-1;
        while(lt<=rt) {
            int mid=(lt+rt)/2;
            if (a[mid]>m) {
                rt=mid-1;
            } else {
                if (a[mid]==m) {
                    answer = mid+1;
                    break;
                }
                lt=mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250526_2 P = new P20250526_2();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        System.out.print(P.solution(n,m,a));
        return ;
    }
}