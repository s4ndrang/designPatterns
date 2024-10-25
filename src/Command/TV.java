package Command;

public class TV implements Device {
    public void power(boolean on) {
        System.out.println("TV turning " + (on ? " on" : " off") + "...");
    }

    @Override
    public void changeChannel(boolean increase) {
        System.out.println("TV channel " + (increase ? " up" : " down") + "...");
    }

    @Override
    public void changeVolume(boolean increase) {
        System.out.println("TV volume " + (increase ? " up" : " down") + "...");
    }

    //OTHER METHODS NOT DEFINED BY INTERFACE
    public void changeBrightness(boolean increase) {
        System.out.println("TV screen " + (increase ? " brighter" : " darker") + "...");

    }
}
