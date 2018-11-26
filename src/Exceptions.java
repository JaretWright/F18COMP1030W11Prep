public class Exceptions {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        firstMethod();
        Thread.dumpStack();
    }

    public static void firstMethod()
    {
        secondMethod();
        Thread.dumpStack();
    }

    public static void secondMethod()
    {
        Thread.dumpStack();
    }

}
