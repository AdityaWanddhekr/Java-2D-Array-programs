import java.util.Scanner;

public class TArray_20 {

    // 10. Write a program to convert an array of 9 elements into a matrix of 3 X 3.

    public static int[][] arrayToMatrix(int a[]) {
        int d[][] = new int[3][3];
        int k = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                d[i][j] = a[k++];
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the element in  array : ");
        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        int mat[][] = arrayToMatrix(a);
        System.out.println("Array after covert matrix is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
