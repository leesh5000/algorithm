import java.util.Scanner;
import java.util.Stack;

public class P20250522_2 {
    public int solution(String s) {
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                st.push((c - 48));
            } else {
                int rt = st.pop();
                int lt = st.pop();
                if (c=='+') st.push((lt+rt));
                else if (c=='-') st.push(lt-rt);
                else if (c=='*') st.push(lt*rt);
                else st.push(lt/rt);
            }
        }
        return st.pop();
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250522_2 P = new P20250522_2();
        String s = in.next();
        System.out.print(P.solution(s));
        return ;
    }
}