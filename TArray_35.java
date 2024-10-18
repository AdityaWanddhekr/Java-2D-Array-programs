import java.util.Scanner;

public class TArray_35 {
    // Border element.

    public static int[][] borderEle(int a[][], int c, int r) {
        int b[][] = new int[r][c];
        int topRow = 0;
        int rightCol = c - 1;
        int bottomRow = r - 1;
        int leftCol = 0;

        for (int i = leftCol; i <= rightCol; i++) {
            b[topRow][i] = a[topRow][i];
        }
        topRow++;
        for (int i = topRow; i <= bottomRow; i++) {
            b[i][rightCol] = a[i][rightCol];
        }
        rightCol--;
        for (int i = rightCol; i >= leftCol; i--) {
            b[bottomRow][i] = a[bottomRow][i];
        }
        bottomRow--;
        for (int i = bottomRow; i >= topRow; i--) {
            b[i][leftCol] = a[i][leftCol];
        }
        leftCol++;

        return b;
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

        System.out.println(" 2d array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int b[][] = borderEle(a, column, row);
        System.out.println(" 2d array boreder  is : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(b[i][j] + " ");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}
