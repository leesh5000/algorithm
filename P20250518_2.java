import java.util.*;

public class P20250518_2 {

    public List<Integer> solution(int n, int k, int[] a) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<k; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        answer.add(map.size());
        for (int i=k; i<n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            map.put(a[i-k], map.get(a[i-k])-1);
            if (map.get(a[i-k])==0) {
                map.remove(a[i-k]);
            }
            answer.add(map.size());
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250518_2 P = new P20250518_2();

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for (int x : P.solution(n,k,a)) {
            System.out.print(x + " ");
        }
        return ;
    }
}