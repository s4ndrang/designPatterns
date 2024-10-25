package Command;

public class Stereo implements Device {
    @Override
    public void power(boolean on) {
        System.out.println("Stereo turning " + (on ? " on" : " off") + "...");
    }

    @Override
    public void changeChannel(boolean increase) {
        System.out.println("Stereo audio track " + (increase ? " increased" : " decreased") + "...");
    }

    @Override
    public void changeVolume(boolean increase) {
        System.out.println("Stereo volume " + (increase ? " up" : " down") + "...");
    }
    public void changeRadioStation(boolean increase) {
        System.out.println("Radio Station " + (increase ? " up" : " down") + "...");

    }
}
