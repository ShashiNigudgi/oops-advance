public class Newspaper extends LibraryItems
{
    public String newspaper_publisher ;

    @Override
    public void displayScreen()
    {
        super.displayScreen();
        System.out.println("Checking if super works here or not ");
    }

    public void checkout()
    {
        System.out.println("chcking out macchi the abstract class ");

    }

}
