#include <stdio.h>
#include <stdlib.h>

#define MAX_INGREDIENTS 100000

typedef struct {
    int id;
    int next;
} Ingredient;

int main() {
    int T, n, k;
    int ingredients[MAX_INGREDIENTS];
    int used[MAX_INGREDIENTS];

    // Read the number of test cases
    scanf("%d", &T);

    while (T--) {
        // Read n and k
        scanf("%d %d", &n, &k);

        // Read the ingredients
        for (int i = 0; i < n; i++) {
            scanf("%d", &ingredients[i]);
        }

        // Initialize the usage map
        for (int i = 0; i < MAX_INGREDIENTS; i++) {
            used[i] = -1;
        }

        int openCount = 0;
        int outsideCount = 0;

        for (int i = 0; i < n; i++) {
            int ingredient = ingredients[i];
            if (used[ingredient] == -1) {
                // If the ingredient is not already outside
                if (outsideCount == k) {
                    // If the outside space is full, remove the oldest ingredient
                    for (int j = 0; j < MAX_INGREDIENTS; j++) {
                        if (used[j] != -1 && used[j] < i) {
                            used[j] = -1;
                            outsideCount--;
                            break;
                        }
                    }
                }
                used[ingredient] = i;
                outsideCount++;
                openCount++;
            } else {
                // Update the usage position
                used[ingredient] = i;
            }
        }

        // Print the result
        printf("%d\n", openCount);
    }

    return 0;
}
