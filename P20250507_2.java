import java.util.Scanner;

public class P20250507_2 {

    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if (tmp.equals(str)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250507_2 P = new P20250507_2();
        System.out.println(P.solution(in.nextLine()));
    }

}
