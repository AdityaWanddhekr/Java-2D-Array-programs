import java.util.Scanner;

public class TArray_40 {
    // Diagonal traverse.

    public static int[] DiagonalTraverse(int a[][]) {
        int[] n = new int[a.length * a[0].length];
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            int k = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (i + j == k) {
                    n[m++] = a[i][j];
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the element in array : ");
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

        int n[] = DiagonalTraverse(a);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        sc.close();
    }
}
