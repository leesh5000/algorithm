import java.util.Scanner;
import java.util.Stack;

public class P20250519_3 {

    public String solution(String s) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                st.push(c);
            } else {
                if (c == '(') st.push(c);
                else {
                    while (st.pop() != '(');
                }
            }
        }
        for (char c : st) answer += c;
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250519_3 P = new P20250519_3();
        String s = in.nextLine();
        System.out.print(P.solution(s));
        return ;
    }
}