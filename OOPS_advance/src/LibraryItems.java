abstract class LibraryItems {

    public String Author;
    public int ID ;
    protected String Title ;

    public LibraryItems(int id, String title, String author) {
        ID = id;
        Title = title;
        Author = author;
    }

    public LibraryItems(){}

    public void displayScreen()
    {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Id: " + ID);
    }

    public abstract void checkout();
}
