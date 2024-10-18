import java.util.Scanner;

public class TArray_12 {

    // 2. Write a Program to find the sum of Secondary Diagonal Elements of a matrix

    public static int secondaryDiagonal(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i + j == 2) {
                    sum += a[i][j];
                }
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

        System.out.println("2D Array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int sum = secondaryDiagonal(a);
        System.out.println("The sum of secondary diagonal elements is : " + sum);

        sc.close();
    }
}
