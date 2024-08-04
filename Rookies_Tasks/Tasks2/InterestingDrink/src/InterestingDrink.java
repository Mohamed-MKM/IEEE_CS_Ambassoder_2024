import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] prices = new int[n];


        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }


        Arrays.sort(prices);


        int q = scanner.nextInt();
        int[] results = new int[q];


        for (int i = 0; i < q; i++) {
            int budget = scanner.nextInt();
            results[i] = upperBound(prices, budget);
        }


        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }


    private static int upperBound(int[] prices, int budget) {
        int left = 0, right = prices.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prices[mid] <= budget) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
