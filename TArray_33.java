import java.util.*;

public class TArray_33 {

    public static int largePrime(int a[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                boolean isPrime = true;
                if (i == j || i + j == 2) {
                    for (int k = 2; k < a[i][j]; k++) {
                        if (a[i][j] % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    max = Math.max(max, a[i][j]);
                }
            }
        }
        return max;
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

            }
        }

        int l = largePrime(a);
        System.out.println("Large prime is : " + l);
        sc.close();
    }
}
