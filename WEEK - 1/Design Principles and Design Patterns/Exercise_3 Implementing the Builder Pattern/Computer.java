public class Computer{

    private final String CPU;
    private final String RAM;
    private final String Storage;
    private final String GPU;
    private final String OperatingSystem;
    private final boolean isSSD;

    // Private Constructor
    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GPU = builder.GPU;
        this.OperatingSystem = builder.OperatingSystem;
        this.isSSD = builder.isSSD;
    }

    @Override
    public String toString(){

        return "\nCPU              : " + CPU +
               "\nRAM              : " + RAM +
               "\nStorage          : " + Storage +
               "\nGPU              : " + GPU +
               "\nOperating System : " + OperatingSystem +
               "\nSSD Enabled      : " + isSSD;
    }

    // Static Nested Builder Class
    public static class Builder{

        private String CPU;
        private String RAM;
        private String Storage;
        private String GPU = "Integrated Graphics";
        private String OperatingSystem = "Windows 11";
        private boolean isSSD;

        public Builder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage){
            this.Storage = Storage;
            return this;
        }

        public Builder setGPU(String GPU){
            this.GPU = GPU;
            return this;
        }

        public Builder setOperatingSystem(String OperatingSystem){
            this.OperatingSystem = OperatingSystem;
            return this;
        }

        public Builder setSSD(boolean isSSD){
            this.isSSD = isSSD;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}