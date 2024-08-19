import java.util.Scanner;

public class IT24101603Lab4Q3
{

          public static void main(String[] args)
          {
               
                 int Number;
                 String Message;
                 Scanner input = new Scanner(System.in);
                 System.out.print("Enter a number: ");
                 Number = input.nextInt();
                 
                 Message = (Number > 0) ? "The Number is: Positive" :
                           (Number < 0) ? "The Number is: Negative" :
                           "The Number is Zero" ;
                 System.out.print(Message);
          }

}
               