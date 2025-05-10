import java.util.Scanner;

public class P20250510_1 {

    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i=0; i<n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 2) answer += "B";
            else if (a[i] == 2 && b[i] == 3) answer += "B";
            else if (a[i] == 3 && b[i] == 1) answer += "B";
            else answer += "A";
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250510_1 P = new P20250510_1();
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for (int i=0; i<n; i++) {
            b[i] = in.nextInt();
        }
        for (char c : P.solution(n, a, b).toCharArray()) {
            System.out.println(c);
        }
    }
}
