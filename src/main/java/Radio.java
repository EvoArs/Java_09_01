public class Radio {
    // Громкость
    private int radioVolume;
    private int radioVolumeMin = 0;
    private int radioVolumeMax = 100;

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume < radioVolumeMin) {
            newRadioVolume = radioVolumeMin;
        }
        if (newRadioVolume > radioVolumeMax) {
            newRadioVolume = radioVolumeMax;
        }
        radioVolume = newRadioVolume;
    }

    public void radioVolumeSwitchUp() {
        if (radioVolume < radioVolumeMax) {
            radioVolume = radioVolume + 1;
        }
    }

    public void radioVolumeSwitchDown() {
        if (radioVolume > radioVolumeMin) {
            radioVolume = radioVolume - 1;
        }
    }

    // Каналы
    private int radioChannel;
    private int radioChannelMin = 0;
    private int radioChannelMax = 9;

    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel < radioChannelMin) {
            newRadioChannel = radioChannelMin;
        }
        if (newRadioChannel > radioChannelMax) {
            newRadioChannel = radioChannelMax;
        }
        radioChannel = newRadioChannel;
    }

    public void radioChannelSwitchUp() {
        if (radioChannel < radioChannelMax) {
            radioChannel = radioChannel + 1;
        }
    }

    public void radioChannelSwitchDown() {
        if (radioChannel > radioChannelMin) {
            radioChannel = radioChannel - 1;
        }
    }
}