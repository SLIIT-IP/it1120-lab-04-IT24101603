import java.util.Scanner;

        public class IT24101603Lab4Q2
        {
              public static void main(String[] args)
              {
                    double Exam_Marks, Lab_Marks, Exam_Percentage, Lab_Percentage, Final_Marks;
                    Scanner input = new Scanner(System.in);

                    System.out.print("Please enter exam marks(out of 100): ");
                    Exam_Marks = input.nextDouble();

                        if (Exam_Marks < 0 || Exam_Marks > 100)
                        {
                        System.out.print("Invalid input for exam marks. Terminating program.");
                        return;
                        }

                    System.out.print("Please enter lab marks(out of 100): ");
                    Lab_Marks = input.nextDouble();

                        if (Lab_Marks < 0 || Lab_Marks > 100)
                        {
                        System.out.print("Invalid input for lab marks. Terminating program.");
                        return;
                        }

                    System.out.print("Please enter the percentage given for the exam: ");
                    Exam_Percentage = input.nextDouble();

                    System.out.print("Please enter the percentage given for the lab submission: ");
                    Lab_Percentage = input.nextDouble();

                        if (Exam_Percentage + Lab_Percentage != 100)
                        {
                        System.out.print("The percentages must add up to 100. Terminating program.");
                        return;
                        }

                    Final_Marks = (Exam_Marks * Exam_Percentage/100 + Lab_Marks * Lab_Percentage/100);
                    System.out.print("Final Exam Mark : "+ Final_Marks);
                  
              }
 
      } 

