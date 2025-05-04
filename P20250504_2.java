import java.util.Scanner;

public class P20250504_2 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(Character.toLowerCase(ch));
            }
            return answer.toString();
        }
        return answer.toString();
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        P20250504_2 T = new P20250504_2();
        System.out.println(T.solution(str));
    }

}
