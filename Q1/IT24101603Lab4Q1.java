import java.util.Scanner;

public class IT24101603Lab4Q1
{
   
          public static void main(String[] args)
          {

                int Number;
                Scanner input = new Scanner(System.in);
                System.out.print("Eneter a number: ");
                Number = input.nextInt();
                if (Number > 0)
                {
                      System.out.print("The Number is: Positive");
                }
                else if (Number < 0)
                {
                      System.out.print("The Number is: Negative");
                }
                else
                {
                     System.out.print("The Number is Zero");
                }
          }
}