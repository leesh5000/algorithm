import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P20250505_2 {

    public List<String> solution(int n, String[] str) {
        List<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        P20250505_2 P = new P20250505_2();
        for (String x : P.solution(n, str)) {
            System.out.println(x);
        }
    }

}
