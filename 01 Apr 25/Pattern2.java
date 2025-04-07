import java.util.*;
public class Pattern2{
    public static void main(String[] args) {
        int b=5,h=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of triangle:");
        b=sc.nextInt();
        System.out.println("Enter the height of the triangle:");
        h=sc.nextInt();
        System.out.println("Area of triangle is:" +((b*h)/2));
    }
}