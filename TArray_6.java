import java.util.Scanner;

public class TArray_6 {

    // 6. Write a program to interchange the given columns.

    public static void swap(int a[][], int i, int c1, int c2) {
        int temp = a[i][c1];
        a[i][c1] = a[i][c2];
        a[i][c2] = temp;
    }

    public static void interchange(int a[][], int c1, int c2) {
        if (c1 >= 1 && c1 <= a.length || c2 >= 1 && c2 <= a.length) {
            c1 -= 1;
            c2 -= 1;
            for (int i = 0; i < a.length; i++) {

                swap(a, i, c1, c2);

            }
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

        System.out.println("2D Array before interchange column is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the no of column to be interchanged : ");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        interchange(a, c1, c2);
        System.out.println("2D Array After interchange column is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
