import java.util.*;

public class TArray_1 {

    // 1. Write a program to Accept a matrix from the user and print it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row :  ");
        int r = sc.nextInt();
        System.out.println("Enter the size of column :  ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the element in 2d array : ");
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

        sc.close();
    }
}