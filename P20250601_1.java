import java.util.Scanner;

class P20250601_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for (char c : s1.toCharArray()) a1[c - 'a']++;
        for (char c : s2.toCharArray()) a2[c - 'a']++;
        int answer=0;
        for (int i=0; i<26; i++) answer += Math.abs(a1[i] - a2[i]);
        System.out.println(answer);
    }
}