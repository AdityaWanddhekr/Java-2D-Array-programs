import java.util.Scanner;

public class TArray_41 {

    public static int lastLength(String s) {
        String str[] = s.split(" ");
        int length = 0;
        for (int i = 0; i < str.length; i++) {
            length = str[i].length();
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int l = lastLength(s);
        System.out.println("The length of the last word is : " + l);

        sc.close();
    }
}
