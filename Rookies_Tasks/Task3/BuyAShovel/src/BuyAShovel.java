import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();

        for (int n = 1; n <= 10; n++) {
            int totalCost = n * k;
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(n);
                return;
            }
        }

        scanner.close();
    }
}