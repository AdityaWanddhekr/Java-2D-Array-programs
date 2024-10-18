import java.util.Scanner;

public class TArray_27 {
    // Pascal's trangle print in matrix.
    public static int[][] pascalMatrix(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];

            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];

            }

        }
        return ans;
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of thr row  : ");
        int n = sc.nextInt();

        int p[][] = pascalMatrix(n);
        printMatrix(p);

        sc.close();
    }

}
