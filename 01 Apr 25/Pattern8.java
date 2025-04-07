import java.util.*;
public class Pattern8{
    public static void main(String[] args) {
        int c;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        c=sc.nextInt();
        for (int i=1;i<=c;i++){
           
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}