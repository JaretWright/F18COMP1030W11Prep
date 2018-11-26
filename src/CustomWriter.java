import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
            Formatter outputFile = new Formatter("outputFile.txt");

            //to make a file that can append an existing file
            FileWriter fw = new FileWriter("appendFile.txt", true);
            Formatter appendFile = new Formatter(fw);

            Scanner keyboard = new Scanner(System.in);
            String userInput;

            do
            {
                System.out.print("Enter some text and I'll write it to a file "
                        + "(type exit to close)");

                userInput = keyboard.nextLine();
                if (!userInput.equalsIgnoreCase("exit"))
                {
                    outputFile.format(userInput + "\n");
                    appendFile.format(userInput + "\n");
                }


            } while (!userInput.equalsIgnoreCase("exit"));

            outputFile.close();
            appendFile.close();
        }
        catch (Exception e)
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
