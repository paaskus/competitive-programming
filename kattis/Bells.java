import java.util.*;

public class Bells {
    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        
        // Produce output
        int[][] perm = permutation(input);
        printGrid(perm);
    }

    public static int[][] permutation(int n) {
        /* base case */
        if (n == 1) return new int[][]{{1}};

        /* recursive step */
        int facn = fac(n);
        int[][] prevSolutions = permutation(n-1);
        int[][] solutions = new int[facn][n];
        boolean left = true;
        int counter = 0;
        for (int i = 0; i < fac(n-1); i++) {
            left = !left;
            int[] result = new int[n];
            if (left) {
                for (int j = 0; j < n; j++) {
                    result = insert(n, j, prevSolutions[i]);
                    solutions[counter] = result;
                    counter++;
                }
            } else {
                for (int j = n-1; j >= 0; j--) {
                    result = insert(n, j, prevSolutions[i]);
                    solutions[counter] = result;
                    counter++;
                }
            }
        }
        return solutions;
    }

    private static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[] insert(int n, int j, int[] array) {
        int[] result = new int[n];
        result[j] = n;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (i == j) {
                flag = true; continue;
            }
            result[i] = (flag) ? array[i-1] : array[i];
        }
        return result;
    }

    private static int fac(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
