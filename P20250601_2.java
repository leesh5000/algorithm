import java.util.Scanner;

class P20250601_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toUpperCase();
        int[] a = new int[26];
        int max = 0;
        for (char c : s1.toCharArray()) max = Math.max(max, ++a[c - 'A']);
        Character answer = null;
        for (int i=0; i<26; i++) {
            if (a[i] == max) {
                if (answer != null) {
                    System.out.print("?");
                    return;
                }
                answer = (char) ('A' + i);
            }
        }
        System.out.print(answer);
    }
}