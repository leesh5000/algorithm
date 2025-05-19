import java.util.Scanner;
import java.util.Stack;

public class P20250519_2 {

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250519_2 P = new P20250519_2();
        String s = in.nextLine();
        System.out.print(P.solution(s));
        return ;
    }
}