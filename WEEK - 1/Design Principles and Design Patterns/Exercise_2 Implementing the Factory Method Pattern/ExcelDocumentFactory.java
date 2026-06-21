public class ExcelDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument(){
        System.out.println("\nExcel Document Factory Invoked");
        return new ExcelDocument();
    }
}