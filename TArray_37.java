import java.util.*;

public class TArray_37 {
    // set matrix zeroes.

    public static void setZero(int a[][]) {
        int rpos = -1;
        int cpos = -1;
        int Rpos = -1;
        int Cpos = -1;
        if (a.length == 1 || a[0].length == 1) {
            a[a.length][a[0].length] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    rpos = i;
                    cpos = j;
                    break;
                }

            }
        }

        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] == 0) {
                    Rpos = i;
                    Cpos = j;

                }

            }
        }

        for (int i = 0; i < a.length; i++) {
            a[rpos][i] = 0;
            a[i][cpos] = 0;
            a[Rpos][i] = 0;
            a[i][Cpos] = 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the element of the array : ");
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

        setZero(a);
        System.out.println("The 2d array is after setting zeroes : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// int row[]= new int[matrix.length];
// int col[]= new int[matrix[0].length];
// for(int i=0;i<matrix.length;i++){
// row[i]=0;
// }
// for(int i=0;i<matrix[0].length;i++){
// col[i]=0;
// }
// for(int i=0;i<matrix.length;i++){
// for(int j=0;j<matrix[0].length;j++){
// if(matrix[i][j]==0){
// row[i]=1;
// col[j]=1;
// }
// }
// }
// for(int i=0;i<row.length;i++){
// for(int j=0;j<col.length;j++){
// if(row[i]==1 || col[j]==1){
// matrix[i][j]=0;
// }
// }
// }