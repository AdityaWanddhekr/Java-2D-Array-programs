import java.util.*;

public class TArray_29 {
    // insert in spiral way.

    public static int[][] insertSpiral(int n) {
        int a[][] = new int[n][n];
        int topRow = 0;
        int rightCol = n - 1;
        int bottomRow = n - 1;
        int leftCol = 0;
        int curr = 1;
        while (curr <= (n * n)) {
            // top
            for (int i = leftCol; i <= rightCol && curr <= n * n; i++) {
                a[topRow][i] = curr++;
            }
            topRow++;
            // RIGHT
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                a[i][rightCol] = curr++;
            }
            rightCol--;

            // bottom
            for (int i = rightCol; i >= leftCol && curr <= n * n; i--) {
                a[bottomRow][i] = curr++;
            }
            bottomRow--;

            // left.
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                a[i][leftCol] = curr++;
            }
            leftCol++;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n : ");
        int n = sc.nextInt();

        int a[][] = insertSpiral(n);
        System.out.println("The insert Spiral 2d array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
