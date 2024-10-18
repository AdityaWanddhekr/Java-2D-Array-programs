import java.util.*;

public class TArray_28 {
    // spiral print.
    public static void spiral(int a[][], int r, int c) {
        int topRow = 0;
        int rightCol = c - 1;
        int bottomRow = r - 1;
        int leftCol = 0;

        int totalnum = 0;
        while (totalnum < (r * c)) {
            // for top row
            for (int i = leftCol; i <= rightCol && totalnum < (r * c); i++) {
                System.out.print(a[topRow][i] + " ");
                totalnum++;
            }
            topRow++;

            // for right column.
            for (int i = topRow; i <= bottomRow && totalnum < (r * c); i++) {
                System.out.print(a[i][rightCol] + " ");
                totalnum++;
            }
            rightCol--;

            // for bottom row.

            for (int i = rightCol; i >= leftCol && totalnum < (r * c); i--) {
                System.out.print(a[bottomRow][i] + " ");
                totalnum++;
            }
            bottomRow--;

            // for leftcol.

            for (int i = bottomRow; i >= topRow && totalnum < (r * c); i--) {
                System.out.print(a[i][leftCol] + " ");
                totalnum++;
            }
            leftCol++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the element of 2d array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2d array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The spiral printing of matrix is : ");
        spiral(a, r, c);
        sc.close();
    }
}
