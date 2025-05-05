import java.util.Scanner;

public class P20250505_1 {

    public String solution(String input) {
        String answer = "";
        int maxLength = Integer.MIN_VALUE;
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                answer = word;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        P20250505_1 P = new P20250505_1();
        System.out.println(P.solution(input));
    }

}
