import java.util.Scanner;

public class TArray_13 {

    // 3. Write a program to interchange the primary diagonal to secondary diagonal
    // of a Square
    // matrix

    public static int[][] interchangePS(int a[][]) {
        int i = 0;
        int j = a.length - 1;
        for (int k = 0; k < a.length; k++) {
            int temp = a[k][i];
            a[k][i] = a[k][j];
            a[k][j] = temp;
            i++;
            j--;
        }
        return a;
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

        int in[][] = interchangePS(a);
        System.out.println("InterChange Array is : ");
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[0].length; j++) {
                System.out.print(in[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
