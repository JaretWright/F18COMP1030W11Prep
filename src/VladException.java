public class VladException extends Exception
{
    //no argument constructor
    public VladException()
    {
        super("Lasagna is good everyday even with wiggly noodles");
    }

    //constructor that accepts a message
    public VladException(String message)
    {
        super(message);
    }

    //constructor accepts a "Throwable" (or another exception) as input
    public VladException(Throwable throwable)
    {
        super(throwable);
    }

    //constructor that accepts a String message and a throwable
    public VladException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

}
