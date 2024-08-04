import java.util.Scanner;

public class VityaInTheCountryside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if (n == 1) {
            if (a[0] == 0) {
                System.out.println("UP");
            } else if (a[0] == 15) {
                System.out.println("DOWN");
            } else {
                System.out.println("-1");
            }
        } else {
            int last = a[n - 1];
            int secondLast = a[n - 2];

            if (last == 0) {
                System.out.println("UP");
            } else if (last == 15) {
                System.out.println("DOWN");
            } else {
                if (last > secondLast) {
                    System.out.println("UP");
                } else {
                    System.out.println("DOWN");
                }
            }
        }

        scanner.close();
    }
}
