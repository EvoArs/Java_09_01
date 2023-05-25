import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тесты громкости
    @Test // Тест текущей громкости
    public void radioVolumeAll() {
        Radio volume = new Radio();
        volume.setRadioVolume(35);
        int expected = 35;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест минимальной громкости
    public void radioVolumeMin() {
        Radio volume = new Radio();
        volume.setRadioVolume(0);
        int expected = 0;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест максимальной громкости
    public void radioVolumeMax() {
        Radio volume = new Radio();
        volume.setRadioVolume(100);
        int expected = 100;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест установки громкости ниже минимальной
    public void radioSetVolumeOverMin() {
        Radio volume = new Radio();
        volume.setRadioVolume(-1);
        int expected = 0;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест установки громкости выше максимальной
    public void radioSetVolumeOverMax() {
        Radio volume = new Radio();
        volume.setRadioVolume(110);
        int expected = 100;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест повышения громкости
    public void radioSwitchVolumeUp() {
        Radio channel = new Radio();
        channel.setRadioVolume(60);
        channel.radioVolumeSwitchUp();
        int expected = 61;
        int actual = channel.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест понижения громкости
    public void radioSwitchVolumeDown() {
        Radio channel = new Radio();
        channel.setRadioVolume(50);
        channel.radioVolumeSwitchDown();
        int expected = 49;
        int actual = channel.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест повышения громкости выше максимальной
    public void radioSwitchVolumeOverUp() {
        Radio channel = new Radio();
        channel.setRadioVolume(101);
        channel.radioVolumeSwitchUp();
        int expected = 100;
        int actual = channel.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест понижения громкости ниже минимальной
    public void radioSwitchVolumeOverDown() {
        Radio channel = new Radio();
        channel.setRadioVolume(-1);
        channel.radioVolumeSwitchDown();
        int expected = 0;
        int actual = channel.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }


    // Тесты каналов
    @Test // Тест текущей станции
    public void radioChannelAll() {
        Radio volume = new Radio();
        volume.setRadioChannel(3);
        int expected = 3;
        int actual = volume.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест минимальной станции
    public void radioChannelMin() {
        Radio volume = new Radio();
        volume.setRadioChannel(0);
        int expected = 0;
        int actual = volume.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест максимальной станции
    public void radioChannelMax() {
        Radio volume = new Radio();
        volume.setRadioChannel(9);
        int expected = 9;
        int actual = volume.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест установки станции ниже минимальной
    public void radioSetChannelOverMin() {
        Radio volume = new Radio();
        volume.setRadioChannel(-1);
        int expected = 0;
        int actual = volume.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест установки станции выше максимальной
    public void radioSetChannelOverMax() {
        Radio volume = new Radio();
        volume.setRadioChannel(10);
        int expected = 9;
        int actual = volume.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест повышения станции
    public void radioSwitchChannelUp() {
        Radio channel = new Radio();
        channel.setRadioChannel(5);
        channel.radioChannelSwitchUp();
        int expected = 6;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест понижения станции
    public void radioSwitchChannelDown() {
        Radio channel = new Radio();
        channel.setRadioChannel(3);
        channel.radioChannelSwitchDown();
        int expected = 2;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест повышения станции выше максимальной
    public void radioSwitchChannelOverUp() {
        Radio channel = new Radio();
        channel.setRadioChannel(10);
        channel.radioChannelSwitchUp();
        int expected = 9;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест понижения станции ниже минимальной
    public void radioSwitchChannelOverDown() {
        Radio channel = new Radio();
        channel.setRadioChannel(-1);
        channel.radioChannelSwitchDown();
        int expected = 0;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

}