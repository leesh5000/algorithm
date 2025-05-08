import java.util.Scanner;

public class P20250508_2 {

    public int[] solution(String s, char c) {
        int[] answer = new int[s.length()];
        int p = 100;
        for (int i = 0; i < answer.length; i++) {
            if (s.charAt(i) == c) p = 0;
            else p++;
            answer[i] = p;
        }
        p = 100;
        for (int i = answer.length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) p = 0;
            else p++;
            answer[i] = Math.min(answer[i], p);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250508_2 P = new P20250508_2();
        for (int x : P.solution(in.next(), in.next().charAt(0))) {
            System.out.print(x + " ");
        }
    }

}
