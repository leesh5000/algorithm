import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class P20250606_1 {

    public static List<Integer> TRIANGULAR_NUMBERS = new ArrayList<>();

    public static int isTriangularNumberSum(int target) {
        for (int x : TRIANGULAR_NUMBERS)
            for (int y : TRIANGULAR_NUMBERS)
                for (int z : TRIANGULAR_NUMBERS)
                    if (x + y + z == target) return 1;
        return 0;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=1000; i++) {
            int triangularNumber = (i * (i + 1)) / 2;
            if (triangularNumber > 1000) break;
            TRIANGULAR_NUMBERS.add(triangularNumber);
        }
        int T = sc.nextInt();
        while (T-- > 0) {
            int k = sc.nextInt();
            System.out.println(isTriangularNumberSum(k));
        }
    }
}