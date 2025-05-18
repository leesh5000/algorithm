import java.util.*;

public class P20250518_1 {

    public String solution(String s1, String s2) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c)==0) return "NO";
            map.put(c, map.get(c)-1);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250518_1 P = new P20250518_1();

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.print(P.solution(s1, s2));
        return ;
    }
}