public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Factory Method Pattern Demonstration");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        // Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        // PDF Document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        // Excel Document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();

        System.out.println("\nFactory Method Pattern Executed Successfully.");
    }
}