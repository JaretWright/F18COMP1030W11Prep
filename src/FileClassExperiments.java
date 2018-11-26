import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FileClassExperiments {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the file or directory you wish to check: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        System.out.printf("The file or directory exists: %b%n", file.exists());

        if (fileName != null)
        {
            System.out.printf("The file %s a directory%n", file.isDirectory()?"is":"is not");
            System.out.printf("The file %s a file%n", file.isFile()?"is":"is not");
            System.out.printf("The relative path is %s%n", file.getPath());
            System.out.printf("The absolute path is %s%n",file.getAbsolutePath());
            System.out.printf("The file object was last modified on %s%n",file.lastModified());
            Date dateModified = new Date(file.lastModified());
            System.out.printf("The file object was last modified on %s%n",dateModified);

            //loop through the elements in the directory
            if (file.isDirectory())
            {
                System.out.println("The elements in the directory are:");
                File[] directoryElements = file.listFiles();
                for(File element:directoryElements)
                {
                    System.out.println(element);
                }
            }
        }
    }
}
