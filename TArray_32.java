import java.util.Scanner;

public class TArray_32 {

    // Lucky number in the matrix.

    public static int lucky(int a[][]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (max < a[j][i]) {
                    max = a[j][i];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (min < a[i][j]) {
                    min = a[i][j];
                }
            }
        }

        if (min == max) {
            return max;
        }
        return -1;
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

        int lucky = lucky(a);
        System.out.println("Lucky number is : " + lucky);

        sc.close();
    }
}
