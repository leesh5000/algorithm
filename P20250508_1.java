import java.util.Scanner;

public class P20250508_1 {

    public int solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            }
        }
        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250508_1 P = new P20250508_1();
        System.out.println(P.solution(in.next()));
    }

}
