import java.util.Scanner;
public class Sum {
      public static void main(String args[])
        {
            int sum = 0;
            System.out.println("Enter the Number :");
            Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
            for(int i=0;i <= x;i++)
            {
                sum = sum +i;  
            }
            System.out.println("Sum of "+x+" numbers is :"+sum);
        } 
    }

