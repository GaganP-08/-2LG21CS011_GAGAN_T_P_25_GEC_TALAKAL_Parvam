import java.util.*;
public class Pattern6{
    public static void main(String[] args) {
        int c;
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        c=sc.nextInt();
        for (int i=1;i<=c;i++){
            for(k=1;k<=c-i;k++)
			{
				System.out.print("" + " ");
			}
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}