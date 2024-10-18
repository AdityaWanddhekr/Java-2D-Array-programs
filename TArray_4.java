import java.util.Scanner;

public class TArray_4 {
    // 4. Write a program to find the sum of the said row of a given matrix.

    public static int sumRow(int a[][], int r) {
        int sum = 0;
        // r = r + 1;
        if (r >= 1 && r <= a.length) {
            r = r - 1;

            for (int j = 0; j < a.length; j++) {
                sum += a[r][j];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the element in 2d Array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the row number to sum : ");
        int row = sc.nextInt();

        int sum = sumRow(a, row);
        System.out.println("Sum of said row is : " + sum);
        sc.close();
    }
}
