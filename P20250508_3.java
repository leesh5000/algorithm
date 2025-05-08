import java.util.Scanner;

public class P20250508_3 {

    public String solution(String s) {
        String answer = "";
        int cnt = 1;
        s += " ";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250508_3 P = new P20250508_3();
        System.out.println(P.solution(in.next()));
    }

}
