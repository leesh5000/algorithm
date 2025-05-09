import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P20250509_2 {

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] < arr[i]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250509_2 P = new P20250509_2();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : P.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
