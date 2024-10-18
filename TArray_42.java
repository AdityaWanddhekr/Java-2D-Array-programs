public class TArray_42 {
    // Search in sorted matrix.

    public static boolean searchMat(int a[][], int key) {
        int row = 0;
        int col = a[0].length - 1;
        while (row < a.length && col >= 0) {

            if (a[row][col] == key) {
                System.out.print("Found at : {" + row + "," + col + "} position\n");
                return true;
            } else if (a[row][col] > key) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("Not found!...");
        return false;
    }

    public static void main(String[] args) {
        int a[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        System.out.println(searchMat(a, key));
    }
}
