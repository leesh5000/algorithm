import java.util.Scanner;

public class P20250507_1 {

    public String solution(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        P20250507_1 P = new P20250507_1();
        System.out.println(P.solution(str));
    }

}
