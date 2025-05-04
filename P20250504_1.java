import java.util.Scanner;

public class P20250504_1 {

    public int solution(String str, char t) {
        int answer = 0;
        String strToUpperCase = str.toUpperCase();
        char tToUpperCase = Character.toUpperCase(t);
        for (char ch : strToUpperCase.toCharArray()) {
            if (tToUpperCase == ch) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        P20250504_1 p = new P20250504_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(p.solution(str, c));
    }
}
