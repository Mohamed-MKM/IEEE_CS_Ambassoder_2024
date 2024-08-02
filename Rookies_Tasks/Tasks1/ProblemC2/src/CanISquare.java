import java.util.Scanner;

public class CanISquare {

    public static boolean canFormSquare(long totalSquares) {
        if (totalSquares < 0) {
            return false;
        }
        long sqrt = (long) Math.sqrt(totalSquares);
        return sqrt * sqrt == totalSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long totalSquares = 0;

            for (int i = 0; i < n; i++) {
                totalSquares += scanner.nextLong(); 
            }

            if (canFormSquare(totalSquares)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
