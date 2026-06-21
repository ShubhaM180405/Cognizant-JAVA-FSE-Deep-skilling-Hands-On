public class WordDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument(){
        System.out.println("\nWord Document Factory Invoked");
        return new WordDocument();
    }
}