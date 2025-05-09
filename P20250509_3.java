import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P20250509_3 {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i=0; i<n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250509_3 P = new P20250509_3();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(P.solution(n, arr));
    }
}
