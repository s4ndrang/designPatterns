package Builder;

public class SuperComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();
    public Computer getComputer() {
        return this.computer;
    }

    @Override
    public void buildCPU() {
        this.computer.setCPU("Super CPU");
    }

    @Override
    public void buildRAM() {
        this.computer.setRAM("Super RAM");
    }

    @Override
    public void buildStorage() {
        this.computer.setStorage("Super Storage");
    }

    @Override
    public Computer build() {
        System.out.println(this.computer);
        return this.computer;
    }
}
