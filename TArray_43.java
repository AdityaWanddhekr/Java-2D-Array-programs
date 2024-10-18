public class TArray_43 {

    public static int Count(int a[][]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };

        int count7 = Count(a);
        System.out.println("The count of 7 is : " + count7);
    }
}
