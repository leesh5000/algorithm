import java.util.Scanner;
import java.util.Stack;

public class P20250523_1 {

    public int solution(String s) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else {
                st.pop();
                if (s.charAt(i-1)=='(') {
                    answer += st.size();
                } else {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250523_1 P = new P20250523_1();
        String s = in.next();
        System.out.print(P.solution(s));
        return ;
    }
}