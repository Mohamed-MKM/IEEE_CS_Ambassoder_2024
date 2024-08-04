import java.util.*;

public class CookingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] ingredients = new int[n];
            for (int i = 0; i < n; i++) {
                ingredients[i] = scanner.nextInt();
            }

            int result = minimizeRefrigeratorOpens(n, k, ingredients);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int minimizeRefrigeratorOpens(int n, int k, int[] ingredients) {
        if (k >= n) return n;


        Set<Integer> outsideSet = new HashSet<>();

        LinkedList<Integer> outsideQueue = new LinkedList<>();
        int fridgeOpenings = 0;

        for (int ingredient : ingredients) {
            if (!outsideSet.contains(ingredient)) {
                if (outsideSet.size() == k) {

                    int oldest = outsideQueue.pollFirst();
                    outsideSet.remove(oldest);
                }

                outsideSet.add(ingredient);
                outsideQueue.addLast(ingredient);
                fridgeOpenings++;
            }
        }

        return fridgeOpenings;
    }
}
