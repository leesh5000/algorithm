import java.io.*;
import java.util.Scanner;

class P20250603_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] += 1;
        }
        for (int i=1; i<=10000; i++) {
            if (arr[i] != 0) {
                while (arr[i]-- != 0) {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
    }
}