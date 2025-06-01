import java.util.Scanner;

class P20250601_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String find = sc.nextLine();
        int count = 0;
        int startIdx = 0;
        while (true) {
            int findIdx = doc.indexOf(find, startIdx);
            if (findIdx == -1) break;
            startIdx = findIdx + find.length();
            count++;
        }
        System.out.println(count);
    }
}