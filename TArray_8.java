import java.util.Scanner;

public class TArray_8 {

    // 8. Write a program to add two matrices.

    public static int[][] sumMatrix(int a[][], int b[][], int r1, int r2) {
        int c[][] = new int[a.length][a.length];
        if (r1 == r2) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        } else {
            System.out.println("Matris is not square matrix.");
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the size of column1 : ");
        int c1 = sc.nextInt();

        int a[][] = new int[r1][c1];

        System.out.println("Enter the element in 2d Array A : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array is A : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // 2nd array B is

        System.out.println("Enter the size of row2 : ");
        int r2 = sc.nextInt();
        System.out.println("Enter the size of column2 : ");
        int c2 = sc.nextInt();

        int b[][] = new int[r2][c2];

        System.out.println("Enter the element in 2d Array B : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array is B : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int c[][] = sumMatrix(a, b, r1, r2);
        if (r1 == r2) {
            System.out.println("Sum 2DArray is : ");
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
