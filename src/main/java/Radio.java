public class Radio {
    private int radioChannel;
    private int radioChannelMin = 0;
    private int radioChannelMax = 9;
    private int radioVolume;
    private int radioVolumeMin = 0;
    private int radioVolumeMax = 100;


    // Громкость
    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume < radioVolumeMin) {
            return;
        }
        if (newRadioVolume > radioVolumeMax) {
            return;
        }
        this.radioVolume = newRadioVolume;
    }

    // Кнопка управления звуком
    public void radioVolumeSwitchNext() {
        if (radioVolume != radioVolumeMax) {
            radioVolume++;
        } else {
            radioVolume = radioVolumeMin;
        }
    }

    public void radioVolumeSwitchPrev() {
        if (radioVolume != radioVolumeMin) {
            radioVolume--;
        } else {
            radioVolume = radioVolumeMax;
        }
    }

    // Каналы
    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel < radioChannelMin) {
            return;
        }
        if (newRadioChannel > radioChannelMax) {
            return;
        }
        this.radioChannel = newRadioChannel;
    }

    // Кнопка управления звуком
    public void radioChannelSwitchNext() {
        if (radioChannel != radioChannelMax) {
            radioChannel++;
        } else {
            radioChannel = radioChannelMin;
        }
    }

    public void radioChannelSwitchPrev() {
        if (radioChannel != radioChannelMin) {
            radioChannel--;
        } else {
            radioChannel = radioChannelMax;
        }
    }
}