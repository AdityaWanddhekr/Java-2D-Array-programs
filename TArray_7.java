import java.util.Scanner;

public class TArray_7 {

    // 7. Write a program to interchange the given rows.

    public static void swap(int a[][], int j, int r1, int r2) {
        int temp = a[r1][j];
        a[r1][j] = a[r2][j];
        a[r2][j] = temp;
    }

    public static void interchange(int a[][], int r1, int r2) {
        if (r1 >= 1 && r1 <= a.length || r2 >= 1 && r2 <= a.length) {
            r1 -= 1;
            r2 -= 1;
            for (int j = 0; j < a.length; j++) {
                swap(a, j, r1, r2);
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

        System.out.println("Enter the no of row to be interchanged : ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        interchange(a, r1, r2);
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
