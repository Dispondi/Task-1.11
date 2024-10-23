import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[2 * n + 1][2 * n + 1];
        int counter = 3;

        // in order to make calculations easier
        matrix[n-1][n] = 1;
        matrix[n-1][n-1] = 2;

        // starter point
        int x = n - 1;
        int y = n;
        int step = 2; // step length at start

    }
}