import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] banknotes = new int[n];

        for (int i = 0; i < n; i++) {
            banknotes[i] = scanner.nextInt();
        }

        if (Arrays.stream(banknotes).anyMatch(x -> x == 1)) {

            System.out.println(-1);
        } else {
            int maxValue = 1000000;
            boolean[] canBeRepresented = new boolean[maxValue + 1];
            canBeRepresented[0] = true;

            for (int value : banknotes) {
                for (int j = value; j <= maxValue; j++) {
                    if (canBeRepresented[j - value]) {
                        canBeRepresented[j] = true;
                    }
                }
            }

            for (int i = 1; i <= maxValue; i++) {
                if (!canBeRepresented[i]) {
                    System.out.println(i);
                    return;
                }
            }
        }

        scanner.close();
    }
}
