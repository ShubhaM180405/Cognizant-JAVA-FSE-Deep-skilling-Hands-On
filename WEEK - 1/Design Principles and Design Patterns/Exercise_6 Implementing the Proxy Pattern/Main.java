public class Main {

    public static void main(String[] args){

        System.out.println("=====================================");
        System.out.println(" Proxy Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("=====================================");

        Image profileImage =
                new ProxyImage("shubham_profile_photo.jpg");

        Image galleryImage =
                new ProxyImage("shubham_college_photo.jpg");

        System.out.println(
                "\nFirst Request for Profile Image"
        );
        profileImage.display();

        System.out.println(
                "\nSecond Request for Profile Image"
        );
        profileImage.display();

        System.out.println(
                "\nFirst Request for College Image"
        );
        galleryImage.display();

        System.out.println(
                "\nSecond Request for College Image"
        );
        galleryImage.display();

        System.out.println(
                "\nProxy Pattern Demonstrated Successfully."
        );
    }
}