package Command;

public class VolumeControl implements Command {
    private Device device;
    public VolumeControl(Device device) {
        this.device = device;
    }
    @Override
    public void execute(boolean increase) {
        device.changeVolume(increase);
    }
}
