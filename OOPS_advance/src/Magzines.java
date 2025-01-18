public class Magzines extends LibraryItems
{
    public int magzineNo;

    public Magzines (int id, String title, String author,int magzineno)
    {
        super(id, title, author);
        this.magzineNo = magzineno;

    }

    public void displayScreen()
    {
        super.displayScreen();
        System.out.println("Magzine number : " + magzineNo);

    }

    public void checkout()
    {
        System.out.println("chcking out macchi the abstract class ");

    }
}
