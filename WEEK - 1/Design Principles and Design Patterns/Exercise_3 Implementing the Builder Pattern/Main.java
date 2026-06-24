public class Main {

    public static void main(String[] args){

        System.out.println("=================================");
        System.out.println(" Builder Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("=================================");

        // Basic Computer
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8 GB")
                .setStorage("1 TB HDD")
                .build();

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 7")
                .setRAM("32 GB")
                .setStorage("1 TB SSD")
                .setGPU("NVIDIA RTX 4070")
                .setSSD(true)
                .build();

        // Workstation Computer
        Computer workstation = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("64 GB")
                .setStorage("2 TB SSD")
                .setGPU("NVIDIA RTX 4090")
                .setOperatingSystem("Ubuntu Linux")
                .setSSD(true)
                .build();

        System.out.println("\n===== Basic Computer =====");
        System.out.println(basicComputer);

        System.out.println("\n===== Gaming Computer =====");
        System.out.println(gamingComputer);

        System.out.println("\n===== Workstation Computer =====");
        System.out.println(workstation);

        System.out.println("\nBuilder Pattern Implemented Successfully.");
    }
}