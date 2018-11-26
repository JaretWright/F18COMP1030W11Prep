import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideZeroExceptionHandling {
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator;
    }

    public static void main(String[] args)
    {
        boolean continueLooping=true;
        do{
            try{
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter the numerator: ");
                int numerator = keyboard.nextInt();

                System.out.print("Enter the denominator: ");
                int denominator = keyboard.nextInt();

                System.out.printf("Result: %d/%d=%d%n", numerator, denominator,
                        quotient(numerator, denominator));
                continueLooping=false;
            }
            catch (InputMismatchException mismatchException)
            {
                System.err.println("Only integers are allowed for input.");
            }
            catch (ArithmeticException mathException)
            {
                System.err.println(mathException.getMessage());
            }
            catch (Exception e)
            {
                System.err.println(e);
            }

        }while(continueLooping);
    }
}
