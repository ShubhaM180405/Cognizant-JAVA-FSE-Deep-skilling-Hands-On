public class RemoteControl{

    private Command command;

    public void setCommand(Command command){

        this.command = command;
    }

    public void pressButton(){

        System.out.println("\nRemote Button has been pressed");

        command.execute();
    }
}