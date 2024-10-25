package Command;

public class BrightnessControl implements Command{
    private TV tv;
    public BrightnessControl(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute(boolean increase) {
        tv.changeBrightness(increase);
    }
}
