
import java.util.*;

public class Pattern0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int c = sc.nextInt();

        System.out.println("Left aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("Right aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("Center aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print("" + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
