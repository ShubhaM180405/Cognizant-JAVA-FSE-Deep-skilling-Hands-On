public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer(){

        System.out.println(
                "Loading your image from remote server : "
                + fileName
        );
    }

    @Override
    public void display() {

        System.out.println(
                "Displaying your image : "
                + fileName
        );
    }
}