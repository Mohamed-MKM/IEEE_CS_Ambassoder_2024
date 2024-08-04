import java.util.Scanner;

public class Cakeminator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        char[][] cake = new char[r][c];
        for (int i = 0; i < r; i++) {
            cake[i] = scanner.nextLine().toCharArray();
        }

        boolean[] rowHasStrawberry = new boolean[r];
        boolean[] colHasStrawberry = new boolean[c];

        // Detect rows and columns that contain strawberries
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (cake[i][j] == 'S') {
                    rowHasStrawberry[i] = true;
                    colHasStrawberry[j] = true;
                }
            }
        }

        // Count eatable cells
        int eatableCells = 0;

        // Add all cells from rows without strawberries
        for (int i = 0; i < r; i++) {
            if (!rowHasStrawberry[i]) {
                eatableCells += c;
            }
        }

        // Add all cells from columns without strawberries, excluding already counted rows
        for (int j = 0; j < c; j++) {
            if (!colHasStrawberry[j]) {
                for (int i = 0; i < r; i++) {
                    if (rowHasStrawberry[i]) {
                        eatableCells++;
                    }
                }
            }
        }

        System.out.println(eatableCells);
        scanner.close();
    }
}
