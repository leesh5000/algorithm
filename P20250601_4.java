import java.util.Scanner;

class P20250601_4 {

    public static int convertToSeconds(String formattedTime) {
        String[] splitTime = formattedTime.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minutes = Integer.parseInt(splitTime[1]);
        int seconds = Integer.parseInt(splitTime[2]);
        return hour * 3600 + minutes * 60 + seconds;
    }

    public static String convertToStringTime(int seconds) {
        int hour = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = (seconds % 3600) % 60;
        return String.format("%2d:%2d:%2d", hour, minutes, sec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.nextLine();
        String saltTime = sc.nextLine();
        int currentTimeSeconds = convertToSeconds(currentTime);
        int saltTimeSeconds = convertToSeconds(saltTime);
        if (currentTimeSeconds >= saltTimeSeconds) {
            saltTimeSeconds += (24 * 3600);
        }
        System.out.println(convertToStringTime(Math.abs(currentTimeSeconds - saltTimeSeconds)));
    }
}