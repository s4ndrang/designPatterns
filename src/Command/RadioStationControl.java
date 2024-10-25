package Command;

public class RadioStationControl implements Command {
    private Stereo stereo;
    public RadioStationControl(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute(boolean increase) {
        stereo.changeRadioStation(increase);
    }
}
