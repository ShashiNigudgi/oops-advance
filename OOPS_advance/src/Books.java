public class Books extends LibraryItems
{

    public int pageNo;
    private int bookId;

   public void checkout()
   {
       System.out.println("chcking out macchi the abstract class ");

   }

    public Books(int id, String title, String author,int pageno) {
        super(id, title, author);
        this.pageNo = pageno;
    }

   @Override
    public void displayScreen()
    {
        super.displayScreen();
        System.out.println("Page Number: " + pageNo);
    }

    public int getbookid()
    {
        bookId = 3;
        return bookId;
    }


}
