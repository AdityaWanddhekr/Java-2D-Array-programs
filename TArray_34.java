import java.util.*;

public class TArray_34 {

    public static void zigZag(int a[][], int c, int r) {
        int topRow = 0;
        int rightCol = c - 1;
        int leftCol = 0;
        // int bottomRow = r - 1;

        int totalnum = 0;
        while (totalnum < r * c) {
            for (int i = leftCol; i <= rightCol && totalnum < r * c; i++) {
                System.out.print(a[topRow][i] + " ");
                totalnum++;
            }
            topRow++;
            for (int i = rightCol; i >= leftCol && totalnum < r * c; i--) {
                System.out.print(a[topRow][i] + " ");
                totalnum++;
            }
            topRow++;
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

        System.out.println(" 2d array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        zigZag(a, column, row);
        sc.close();
    }
}
