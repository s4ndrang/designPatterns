package Builder;

public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("Gaming RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("Gaming Storage");
    }

    @Override
    public Computer build() {
        System.out.println(computer);
        return computer;
    }
}
