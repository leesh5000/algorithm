import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P20250531_1 {
    int[] dis={-1,1,5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch=new int[10001];
        ch[s]=1;
        Q.offer(s);
        int L=0;
        while(!Q.isEmpty()) {
            int len=Q.size();
            for (int i=0; i<len; i++) {
                int x=Q.poll();
                for (int di : dis) {
                    int nx = x + di;
                    if (nx == e) return L+1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250531_1 P = new P20250531_1();
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.print(P.BFS(s,e));
        return ;
    }
}