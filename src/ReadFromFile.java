import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException
    {
        File fileToRead = new File("Cool file.txt");
        Scanner fileReader = new Scanner(fileToRead);

        while (fileReader.hasNext())
        {
            System.out.println(fileReader.nextLine());
        }

        fileReader.close();
    }

}
