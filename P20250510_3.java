import java.util.Scanner;

public class P20250510_3 {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i=2; i<=n; i++) {
            if (ch[i]==0) {
                answer++;
                for (int j=i; j<=n; j=j+i) ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250510_3 P = new P20250510_3();
        int n = in.nextInt();
        System.out.println(P.solution(n));
    }

}
