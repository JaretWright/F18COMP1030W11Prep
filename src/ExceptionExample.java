import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args)
    {
        double salary=-1;


        while (salary < 0)
        {
            try{
                System.out.print("What is your expected annual salary upon graduation? ");
                Scanner keyboard = new Scanner(System.in);
                salary = keyboard.nextDouble();

                if (salary < 0)
                    System.out.println("Come on, you will earn more than 0...try again");
                else
                    System.out.printf("You are expecting %s per year", NumberFormat.getCurrencyInstance().format(salary));
            } catch (InputMismatchException e)
            {
                System.out.println("Sorry, you must use numeric input");
            }
        }



    }
}
