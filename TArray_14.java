import java.util.Scanner;

public class TArray_14 {

    // 4. Write a program to check whether the given matrix is symmetric or not.

    public static boolean symmetricArray(int a[][]) {
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i != j && a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return flag;
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

        if (symmetricArray(a) == true) {
            System.out.println("2DArray is Symetrical");
        } else {
            System.out.println("2DArray is not Symetrical");

        }
        sc.close();
    }
}
