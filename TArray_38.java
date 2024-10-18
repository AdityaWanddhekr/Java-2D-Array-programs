import java.util.Scanner;

public class TArray_38 {
    // Lucky number.

    public static int luckyNum(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            int min = Integer.MAX_VALUE;
            int pos = -1;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    pos = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < a.length; k++) {
                if (a[k][pos] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                return min;
            }

        }
        return -1;

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

        int lucky = luckyNum(a);
        System.out.println("The lucky number in the matrix is : " + lucky);
        sc.close();
    }
}