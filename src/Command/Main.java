package Command;

public class Main {
    public static void main(String args[]) {
        TV tv = new TV();
        Stereo stereo = new Stereo();

        Power TVpower = new Power(tv);
        BrightnessControl TVbrightness = new BrightnessControl(tv);
        VolumeControl TVvolume = new VolumeControl(tv);
        ChannelControl TVchannel = new ChannelControl(tv);

        Power stereoPower = new Power(stereo);
        ChannelControl stereoChannel = new ChannelControl(stereo);
        VolumeControl stereoVolume = new VolumeControl(stereo);
        RadioStationControl stereoRadioStationControl = new RadioStationControl(stereo);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(TVpower);
        remote.pressButton(true);

        remote.setCommand(TVbrightness);
        remote.pressButton(true);

        remote.setCommand(TVvolume);
        remote.pressButton(true);

        remote.setCommand(TVchannel);
        remote.pressButton(true);

        remote.setCommand(stereoPower);
        remote.pressButton(true);

        remote.setCommand(stereoChannel);
        remote.pressButton(true);

        remote.setCommand(stereoVolume);
        remote.pressButton(true);

        remote.setCommand(stereoRadioStationControl);
        remote.pressButton(true);
    }
}
