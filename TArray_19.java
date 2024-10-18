import java.util.Scanner;

public class TArray_19 {

    // 9. Write a Program to accepts a square matrix and print the trace and normal
    // of the matrix

    public static double trace(int a[][]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static double normal(int a[][]) {
        double square = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                square += a[i][j] * a[i][j];

            }
        }
        double res = Math.sqrt(square);
        return res;
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

        double trace = trace(a);
        System.out.println("Trace is : " + trace);
        double normal = normal(a);
        System.out.println("Normal is : " + normal);

        sc.close();
    }
}
