public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Command Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        Light light = new Light();

        Command lightOn = new LightOnCommand(light);

        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        System.out.println("\nTurning the Light ON");

        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("\nTurning the Light OFF");

        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("\nCommand Pattern Executed Successfully.");
    }
}