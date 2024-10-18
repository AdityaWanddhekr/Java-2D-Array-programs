import java.util.*;

public class TArray_36 {
    // sum in a matrix.

    public static int sumMat(int a[][]) {

        int sum = 0;
        for (int j = 0; j < a[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] > max) {
                    max = a[i][j];

                }

            }
            // System.out.println("max = " + max);
            sum += max;
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

        System.out.println("Enter the element in 2d matrix : ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2d array is : ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int sum = sumMat(a);
        System.out.println("The sum in a matrix is : " + sum);

        sc.close();
    }
}