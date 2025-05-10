import java.util.Scanner;

public class P20250510_2 {

    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250510_2 P = new P20250510_2();
        for (int x : P.solution(in.nextInt())) {
            System.out.print(x + " ");
        }
    }
}
