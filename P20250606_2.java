import java.io.IOException;
import java.util.Scanner;

class P20250606_2 {

    public static StringBuilder ANSWER = new StringBuilder();

    public static void dfs(int n, int b) {
        if (n==0) return;
        dfs(n/b, b);
        if (n%b >= 10) {
            ANSWER.append((char)(n%b-10+'A'));
        } else {
            ANSWER.append(n % b);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        dfs(n, b);
        System.out.println(ANSWER);
    }
}