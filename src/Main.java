import java.util.*;

public class Main {
    private static void fillMatrix(int n, int[][] matrix) {
        int counter = 2;

        // directions
        int[][] dirctns = new int[][] {{0,1}, {1,0}, {0,-1}, {-1,0}}; // {x,y}
        int direction = 0;

        // starter point
        int x = n - 1;
        int y = n - 1;
        int stepLen = 2; // step length at start

        while (counter <= (((2 * n) + 1) * ((2 * n) + 1)) - 1) {
            for (int cycle = 0; cycle < 2; cycle++) {
                for (int step = 0; step < stepLen; step++) {
                    // walk
                    x += dirctns[direction][0];
                    y += dirctns[direction][1];

                    if (x < 0 || y < 0) {
                        return;
                    }

                    matrix[y][x] = ++counter;
                }

                direction = switchDirection(direction);
            }
            stepLen++;
        }
    }

    private static int switchDirection(int directionNow) {
        int max = 3;

        directionNow++;
        if (directionNow > max) {
            directionNow = 0;
        }

        return directionNow;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[2 * n + 1][2 * n + 1];

        // in order to make calculations easier
        matrix[n-1][n] = 1;
        matrix[n-1][n-1] = 2;

        fillMatrix(n, matrix);
        printMatrix(matrix); // printing

    }
}