package Builder;

public class Main {
    public static void main(String[] args) {

        ComputerBuilderManager manager = new ComputerBuilderManager();
        SuperComputerBuilder superComputer = new SuperComputerBuilder();
        GamingComputerBuilder gamingComputer = new GamingComputerBuilder();
        manager.construct(superComputer);
        manager.construct(gamingComputer);
    }
}