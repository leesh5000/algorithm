import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class P20250606_3 {

    public static String[] ALPHABETS = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "가", "나"
    };

    public static String dfs(int n, int b, StringBuilder result) {
        if (n==0) return result.toString();
        dfs(n/b, b, result);
        if (n%b >= 10) result.append(ALPHABETS[n%b-10]);
        else result.append(n % b);
        return result.toString();
    }

    public static int isPalindrome(int n) {
        int palindrome = 0;
        for (int b=2; b<=64; b++) {
            String result = dfs(n, b, new StringBuilder());
            StringBuilder sb = new StringBuilder(result);
            String origin = sb.toString();
            String reverse = sb.reverse().toString();
            if (origin.equals(reverse)) {
                palindrome = 1;
                break;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> answers = new ArrayList<>();
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            answers.add(isPalindrome(n));
        }
        for (int x : answers) System.out.println(x);
    }
}