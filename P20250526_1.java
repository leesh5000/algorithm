import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P20250526_1 {

    public static class Point implements Comparable<Point> {
        int x;
        int y;
        public Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(new Point(in.nextInt(), in.nextInt()));
        }
        Collections.sort(list);
        for (Point p : list) {
            System.out.println(p.x + " " + p.y);
        }
        return ;
    }
}