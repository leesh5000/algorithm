import java.util.Scanner;

class P20250602_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i=0; i<n; i++) {
            String str = sc.next();
            for (int j=0; j<m; j++) {
                char c = str.charAt(j);
                if (c == 'X') {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        int rowEmptyCount = 0;
        for (int i=0; i<n; i++)
            if (row[i] == 0) rowEmptyCount++;
        int colEmptyCount = 0;
        for (int i=0; i<m; i++)
            if (col[i] == 0) colEmptyCount++;
        System.out.println(Math.max(rowEmptyCount, colEmptyCount));
    }
}