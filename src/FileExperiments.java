import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileExperiments {
    public static void main(String[] args)
    {

        try {
            Formatter outputFile = new Formatter("Cool file.txt");
            outputFile.format("I just wrote to a file!");
            outputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
