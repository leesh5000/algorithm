import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P20250517_3 {

    public char solution(int n, String s) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key)>max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250517_3 P = new P20250517_3();

        int n = in.nextInt();
        String s = in.next();
        System.out.print(P.solution(n, s));
        return ;
    }
}