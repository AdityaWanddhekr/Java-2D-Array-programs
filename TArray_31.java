import java.util.Scanner;

public class TArray_31 {

    // Modify the matrix.

    public static int[][] modify(int a[][]) {

        for (int j = 0; j < a[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (max < a[i][j]) {
                    max = a[i][j];

                }

            }
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] == -1) {
                    a[i][j] = max;
                }
            }
            System.out.println("max = " + max);
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int column = sc.nextInt();

        int a[][] = new int[row][column];

        System.out.println("Enter the element in 2d array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int mat[][] = modify(a);
        System.out.println("Modified 2D array is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
