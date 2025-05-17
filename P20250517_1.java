import java.util.Scanner;

public class P20250517_1 {

    public int solution(int n) {
        int lt=0, sum=0, answer=0;
        for (int rt=1; rt<=(n/2)+1; rt++) {
            sum += rt;
            if (sum == n) answer++;
            while (sum > n) {
                sum -= lt++;
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250517_1 P = new P20250517_1();
        int n = in.nextInt();
        System.out.print(P.solution(n));
        return ;
    }
}