import java.util.Scanner;

public class TArray_22 {

    // 2. Write a program to check whether a given matrix is unit matrix or not.

    public static boolean unitMatrix(int a[][]) {
        boolean isUnit = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j && a[i][j] == 0 && a[i][j] != 1) {
                    isUnit = false;
                    break;
                }
            }
            if (!isUnit) {
                break;
            }
        }
        if (isUnit) {
            return true;
        } else {
            return false;
        }

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

        boolean isUnit = unitMatrix(a);
        System.out.println("Matix is Unit : " + isUnit);

        sc.close();
    }
}
