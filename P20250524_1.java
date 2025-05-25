import java.util.*;

public class P20250524_1 {

    public class Person {
        int id;
        int priority;
        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int m, int n, int[] a) {
        int answer = 0;
        Queue<Person> q = new LinkedList<Person>();
        for (int i=0; i<n; i++) q.offer(new Person(i, a[i]));
        while (!q.isEmpty()) {
            Person p = q.poll();
            for (Person x : q) {
                if (p.priority < x.priority) {
                    q.offer(p);
                    p = null;
                    break;
                }
            }
            if (p != null) {
                answer++;
                if (p.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        P20250524_1 P = new P20250524_1();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        System.out.print(P.solution(m,n,a));
        return ;
    }
}