public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display(){

        if (realImage == null){

            System.out.println(
                    "\n[Lazy Initialization Activated]"
            );

            realImage = new RealImage(fileName);
        }
        else{

            System.out.println(
                    "\n[Using Cached Image]"
            );
        }

        realImage.display();
    }
}