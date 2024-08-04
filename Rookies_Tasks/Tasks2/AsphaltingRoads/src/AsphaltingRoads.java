import java.util.Scanner;
import java.util.ArrayList;

public class AsphaltingRoads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int n2 = n * n;

        boolean[] asphaltedHorizontals = new boolean[n + 1];
        boolean[] asphaltedVerticals = new boolean[n + 1];
        ArrayList<Integer> days = new ArrayList<>();

        for (int i = 1; i <= n2; i++) {
            int h = scanner.nextInt();
            int v = scanner.nextInt();

            if (!asphaltedHorizontals[h] && !asphaltedVerticals[v]) {
                asphaltedHorizontals[h] = true;
                asphaltedVerticals[v] = true;
                days.add(i);
            }
        }

        for (int day : days) {
            System.out.print(day + " ");
        }
    }
}
