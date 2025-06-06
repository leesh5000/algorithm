import java.io.IOException;
import java.util.Scanner;

class P20250603_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1_000_001];
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            arr[num] = 1;
        }
        int x = sc.nextInt();
        int ans = 0;
        for (int i=1; i<=1_000_000; i++) {
            if (i > x || (x-i >= 1_000_000) || (i == x-i)) continue;
            if (arr[i]==1 && arr[x-i]==1) {
                ans++;
                arr[i]=0;
                arr[x-i]=0;
            }
        }
        System.out.println(ans);
    }
}