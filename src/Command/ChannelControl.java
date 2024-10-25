package Command;

public class ChannelControl implements Command {
    private Device device;
    public ChannelControl(Device device) {
        this.device = device;
    }

    @Override
    public void execute(boolean increase) {
        device.changeChannel(increase);
    }
}
