import java.util.Scanner;

public class TArray_5 {

    // 5. Write a program to find the sum of the said column of a given matrix.

    public static int sumColumn(int a[][], int c) {
        int sum = 0;
        if (c >= 1 && c <= a.length) {
            c = c - 1;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][c];
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

        System.out.println("Enter the no of column to sum : ");
        int column = sc.nextInt();

        int sum = sumColumn(a, column);
        System.out.println("sum of said column is : " + sum);
        sc.close();
    }
}
