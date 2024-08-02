import java.util.Scanner;

public class ClockConversion {

    public static void convertAndPrintTime(String time24) {
        String[] parts = time24.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minute = parts[1];

        String period;
        if (hour < 12) {
            period = "AM";
            if (hour == 0) {
                hour = 12;
            }
        } else {
            period = "PM";
            if (hour > 12) {
                hour -= 12;
            }
            if (hour == 0) {
                hour = 12;
            }
        }


        System.out.printf("%02d:%s %s%n", hour, minute, period);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < t; i++) {
            String time24 = scanner.nextLine();
            convertAndPrintTime(time24);
        }

        scanner.close();
    }
}
