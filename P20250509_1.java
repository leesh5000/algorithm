import java.util.Scanner;

public class P20250509_1 {

    public String solution(int n, String s) {
        String answer = "";
        s = s.replace('#', '1').replace('*', '0');
        for (int i=0; i<n; i++) {
            String tmp = s.substring(0, 7);
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250509_1 P = new P20250509_1();
        System.out.println(P.solution(in.nextInt(), in.next()));
    }

}
