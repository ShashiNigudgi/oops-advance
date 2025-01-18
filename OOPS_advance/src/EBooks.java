public class EBooks  extends Books{

    public String docType ;

    public EBooks (int id, String title , String author,int pageno,String doctype)
    {
        super(id, title, author,pageno);
        this.docType = doctype ;

    }

    @Override
    public void displayScreen() {
        super.displayScreen();
        System.out.println("doctype is :" +docType);
    }
}
