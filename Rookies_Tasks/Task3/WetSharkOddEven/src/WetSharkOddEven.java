import java.util.Scanner;

public class WetSharkOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        long totalSum = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            totalSum += numbers[i];
            if (numbers[i] % 2 != 0 && numbers[i] < minOdd) {
                minOdd = numbers[i];
            }
        }

        if (totalSum % 2 == 0) {
            System.out.println(totalSum);
        } else {
            System.out.println(totalSum - minOdd);
        }

        scanner.close();
    }
}