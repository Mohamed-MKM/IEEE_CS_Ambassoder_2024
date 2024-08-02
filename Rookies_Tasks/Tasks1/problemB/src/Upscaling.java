import java.util.Scanner;

public class Upscaling {

    public static void generateAndPrintCheckerboard(int n) {
        int size = 2 * n;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (((i / 2) + (j / 2)) % 2 == 0) {
                    System.out.print('#');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            generateAndPrintCheckerboard(n);

        }

        scanner.close();
    }
}