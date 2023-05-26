public class Radio {
    private int radioChannel;
    private int radioChannelMin;
    private int radioChannelMax;
    private int radioVolume;
    private int radioVolumeMin;
    private int radioVolumeMax;


    // Громкость
    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume < 0) {
            return;
        }
        if (newRadioVolume > 100) {
            return;
        }
        this.radioVolume = newRadioVolume;
    }

    // Кнопка управления звуком
    public void radioVolumeSwitchNext() {
        if (radioVolume != 100) {
            radioVolume++;
        } else {
            radioVolume = 0;
        }
    }

    public void radioVolumeSwitchPrev() {
        if (radioVolume != 0) {
            radioVolume--;
        } else {
            radioVolume = 100;
        }
    }

    // Каналы
    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel < 0) {
            return;
        }
        if (newRadioChannel > 9) {
            return;
        }
        this.radioChannel = newRadioChannel;
    }

    // Кнопка управления звуком
    public void radioChannelSwitchNext() {
        if (radioChannel != 9) {
            radioChannel++;
        } else {
            radioChannel = 0;
        }
    }

    public void radioChannelSwitchPrev() {
        if (radioChannel != 0) {
            radioChannel--;
        } else {
            radioChannel = 9;
        }
    }
}