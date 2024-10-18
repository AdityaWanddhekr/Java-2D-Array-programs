import java.util.Scanner;

public class TArray_10 {

    // 9. 10. Write a program to print the Secondary Diagonal Elements of a Square
    // matrix.

    public static void princileDiagonal(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i + j == 2) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
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

        princileDiagonal(a);

        sc.close();
    }
}
