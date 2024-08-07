import java.util.*;

public class Main {

    private static boolean hasFullXColumn(char[] cards, int a, int b) {
        for (int col = 0; col < b; col++) {
            boolean allX = true;
            for (int row = 0; row < a; row++) {
                if (cards[row * b + col] != 'X') {
                    allX = false;
                    break;
                }
            }
            if (allX) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String line = scanner.nextLine();
            char[] cards = line.toCharArray();

            List<String> results = new ArrayList<>();

            int[][] pairs = {
                    {1, 12},
                    {2, 6},
                    {3, 4},
                    {4, 3},
                    {6, 2},
                    {12, 1}
            };

            for (int[] pair : pairs) {
                int a = pair[0];
                int b = pair[1];
                if (hasFullXColumn(cards, a, b)) {
                    results.add(a + "x" + b);
                }
            }

            System.out.print(results.size());
            for (String result : results) {
                System.out.print(" " + result);
            }
            System.out.println();
        }

        scanner.close();
    }
}
