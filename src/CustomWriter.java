import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CustomWriter
{

    /**
     * This file will continuously ask the user for input and write
     * it to a file called harambe.txt until the user types "exit"
     */
    public void printToFile()
    {
        try
        {
            Formatter outputStream = new Formatter("harambe.txt");

            Scanner keyboard = new Scanner(System.in);
            String userInput;

            do
            {
                System.out.print("Enter some text and I'll write it to a file "
                        + "(type exit to close)");

                userInput = keyboard.nextLine();
                if (!userInput.equalsIgnoreCase("exit"))
                    outputStream.format(userInput + "\n");

            } while (!userInput.equalsIgnoreCase("exit"));

            outputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.print("Sorry we cannot write to harambe.txt");
        }
    }


    public static void main(String[] args)
    {
        CustomWriter myWriter = new CustomWriter();
        myWriter.printToFile();
    }
}
