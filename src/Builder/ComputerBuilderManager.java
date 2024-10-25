package Builder;

public class ComputerBuilderManager {
    public void construct(ComputerBuilder builder) {
       builder.buildCPU();
       builder.buildRAM();
       builder.buildStorage();
       builder.build();
    }
}
