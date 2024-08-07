import java.util.Scanner;

public class IsItRated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        boolean rated = false;
        boolean nonIncreasing = true;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();

            if (a[i] != b[i]) {
                rated = true;
            }

            if (i > 0 && a[i] > a[i - 1]) {
                nonIncreasing = false;
            }
        }

        if (rated) {
            System.out.println("rated");
        } else if (!nonIncreasing) {
            System.out.println("unrated");
        } else {
            System.out.println("maybe");
        }

        scanner.close();
    }
}