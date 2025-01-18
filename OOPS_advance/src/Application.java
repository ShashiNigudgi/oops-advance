public class Application {
    public static void main(String[] args) {

        //calling libreary items

        //LibraryItems libItems = new LibraryItems(1, "Java for Dummies", "John Doe");
        //libItems.displayScreen();

        System.out.println("----------------------------------------------------------------");

        //calling Book items
        Books book1 = new Books(2,"DSA", "Karumanchi", 250);
        book1.displayScreen();

        book1.checkout();

        System.out.println("----------------------------------------------------------------");

        //calling Magzines items
        Magzines magzine1 = new Magzines(3,"DBA", "ORACLE", 2);
        magzine1.displayScreen();
        magzine1.checkout();

        System.out.println("----------------------------------------------------------------");

        //calling Ebooks items
        EBooks ebook1 = new EBooks(4,"Python", "Code with Harry",50,"pdf");
        ebook1.displayScreen();

        System.out.println("----------------------------------------------------------------");

        //calling Newspaper items
        Newspaper newspaper1 = new Newspaper();
        newspaper1.displayScreen();



    }
}
