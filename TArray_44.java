import java.util.Scanner;

public class TArray_44 {
    // print the sum of the given row of 2 d array.

    public static int RowSum(int a[][], int r) {
        r = r - 1;
        int sum = 0;
        for (int i = 0; i < a[0].length; i++) {
            sum += a[r][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int sum = RowSum(a, row);
        System.out.println("The sum of the row " + row + " is : " + sum);

        sc.close();
    }

}