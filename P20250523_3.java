import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P20250523_3 {

    public String solution(String s1, String s2) {
        Queue<Character> q = new LinkedList<>();
        for (char c : s1.toCharArray()) q.offer(c);
        for (char c : s2.toCharArray()) {
            if (!q.isEmpty() && c==q.peek()) q.poll();
            else {
                if (q.contains(c)) return "NO";
            }
        }
        return q.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250523_3 P = new P20250523_3();
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.print(P.solution(s1,s2));
        return ;
    }
}