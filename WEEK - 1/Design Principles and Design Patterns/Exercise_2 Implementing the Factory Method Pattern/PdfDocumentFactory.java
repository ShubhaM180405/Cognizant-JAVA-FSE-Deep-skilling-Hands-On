public class PdfDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument(){
        System.out.println("\nPDF Document Factory Invoked");
        return new PdfDocument();
    }
}