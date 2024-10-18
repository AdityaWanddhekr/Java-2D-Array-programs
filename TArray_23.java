import java.util.Scanner;

public class TArray_23 {
    // Multiplication of the 2d array.

    public static void multiMat(int a[][], int b[][], int r, int r1, int c, int c1) {

        if (c != r1) {
            System.out.println("The multiplication not posible");
            return;
        }
        int mat[][] = new int[r][c1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < c; k++) {
                    mat[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        System.out.println("The 2d array mutiplication array is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first 2d array .
        System.out.println("Enter the size of the row : ");
        int r = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the elemnt of the 2d array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2d array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        // second 2d array .
        System.out.println("Enter the size of the row : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c1 = sc.nextInt();

        int b[][] = new int[r1][c1];

        System.out.println("Enter the elemnt of the 2d array : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2d array is : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        multiMat(a, b, r, r1, c, c1);

        sc.close();
    }
}