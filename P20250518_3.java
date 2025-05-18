import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P20250518_3 {

    public int solution(String s1, String s2) {
        int answer = 0;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for (char c : s2.toCharArray()) m2.put(c, m2.getOrDefault(c, 0)+1);
        int l1 = s1.length();
        int l2 = s2.length();
        for (int i=0; i<l1; i++) {
            if (i < l2) {
                m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0)+1);
            } else {
                m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0)+1);
                m1.put(s1.charAt(i-l2), m1.get(s1.charAt(i-l2))-1);
                if (m1.get(s1.charAt(i-l2))==0) m1.remove(s1.charAt(i-l2));
            }
            if (m1.equals(m2)) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250518_3 P = new P20250518_3();
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.print(P.solution(s1, s2));
        return ;
    }
}