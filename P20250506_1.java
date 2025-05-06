import java.util.Scanner;

public class P20250506_1 {

    public String solution(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] ch = str.toCharArray();
        while (lt < rt) {
            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        P20250506_1 P = new P20250506_1();
        System.out.println(P.solution(str));
    }

}
