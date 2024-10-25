package Builder;

import Builder.Computer;

public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer build();
}
