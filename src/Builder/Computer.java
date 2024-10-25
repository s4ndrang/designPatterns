package Builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }
    public void setRAM(String ram) {
        this.ram = ram;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String toString() {
        return "Builder.Computer Configuration: " + "CPU : " + this.cpu + " "  + "RAM : "+ this.ram + " " + "STORAGE : " + this.storage;
    }

}
