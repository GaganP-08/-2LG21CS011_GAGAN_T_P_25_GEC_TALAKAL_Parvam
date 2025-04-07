import java.util.*;
public class Pattern3{
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        c=sc.nextInt();
        for (int i=1;i<=c;i++){
            System.out.print("*");
        }
    }
}