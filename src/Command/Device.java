package Command;

public interface Device {
    void power(boolean on);
    void changeChannel(boolean increase);
    void changeVolume(boolean increase);

}
