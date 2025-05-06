import java.util.Scanner;

public class P20250506_2 {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == str.indexOf(c)) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        P20250506_2 P = new P20250506_2();
        System.out.println(P.solution(str));
    }

}
