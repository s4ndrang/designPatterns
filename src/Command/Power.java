package Command;

public class Power implements Command {
    private Device device;
    public Power(Device device) {
        this.device = device;
    }

    @Override
    public void execute(boolean on) {
        device.power(on);
    }
}
