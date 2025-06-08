import java.io.IOException;
import java.util.Scanner;

class P20250608_1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int person = 1;
            for (int i=0; i<w; i++)
                for (int j=0; j<h; j++)
                    if (person++ == n) System.out.printf("%d%02d%n", j + 1, i + 1);
        }
    }
}
