import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int costInd = n * a;


        int costMulti = ((n + m - 1) / m) * b;


        int minCost = costInd;


        for (int i = 0; i <= (n + m - 1) / m; i++) {
            int fullMultiTicketsCost = i * b;
            int ridesCoveredByMulti = i * m;
            int remainingRides = Math.max(0, n - ridesCoveredByMulti);
            int remainingCost = remainingRides * a;
            minCost = Math.min(minCost, fullMultiTicketsCost + remainingCost);
        }

        System.out.println(minCost);
        scanner.close();
    }
}
