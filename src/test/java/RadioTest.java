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

    @Test // Тест граничныйх значений
    public void radioVolumeBoundaryMin1() {
        Radio volume = new Radio();
        volume.setRadioVolume(-1);
        int expected = 0;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioVolumeBoundaryMin2() {
        Radio volume = new Radio();
        volume.setRadioVolume(0);
        int expected = 0;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioVolumeBoundaryMin3() {
        Radio volume = new Radio();
        volume.setRadioVolume(1);
        int expected = 1;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioVolumeBoundaryMax1() {
        Radio volume = new Radio();
        volume.setRadioVolume(99);
        int expected = 99;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioVolumeBoundaryMax2() {
        Radio volume = new Radio();
        volume.setRadioVolume(100);
        int expected = 100;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioVolumeBoundaryMax3() {
        Radio volume = new Radio();
        volume.setRadioVolume(101);
        int expected = 0;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки повышения громкости
    public void radioVolumeSwitchNext() {
        Radio volume = new Radio();
        volume.setRadioVolume(50);
        volume.radioVolumeSwitchNext();
        int expected = 51;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки повышения громкости
    public void radioVolumeSwitchNextMax() {
        Radio volume = new Radio();
        volume.setRadioVolume(100);
        volume.radioVolumeSwitchNext();
        int expected = 0;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки понижения громкости
    public void radioVolumeSwitchPrev() {
        Radio volume = new Radio();
        volume.setRadioVolume(50);
        volume.radioVolumeSwitchPrev();
        int expected = 49;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки понижения громкости
    public void radioVolumeSwitchPrevMin() {
        Radio volume = new Radio();
        volume.setRadioVolume(0);
        volume.radioVolumeSwitchPrev();
        int expected = 100;
        int actual = volume.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тесты каналов
    @Test // Тест текущей станции
    public void radioChannelAll() {
        Radio channel = new Radio();
        channel.setRadioChannel(3);
        int expected = 3;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioChannelBoundaryMin1() {
        Radio channel = new Radio();
        channel.setRadioChannel(0);
        int expected = 0;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioChannelBoundaryMin2() {
        Radio channel = new Radio();
        channel.setRadioChannel(-1);
        int expected = 0;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioChannelBoundaryMin3() {
        Radio channel = new Radio();
        channel.setRadioChannel(1);
        int expected = 1;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioChannelBoundaryMax1() {
        Radio channel = new Radio();
        channel.setRadioChannel(8);
        int expected = 8;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioChannelBoundaryMax2() {
        Radio channel = new Radio();
        channel.setRadioChannel(9);
        int expected = 9;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест граничныйх значений
    public void radioChannelBoundaryMax3() {
        Radio channel = new Radio();
        channel.setRadioChannel(10);
        int expected = 0;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки переключения каналла вверх
    public void radioChannelSwitchNext() {
        Radio channel = new Radio();
        channel.setRadioChannel(4);
        channel.radioChannelSwitchNext();
        int expected = 5;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки переключения каналла вверх
    public void radioChannelSwitchNextMax() {
        Radio channel = new Radio();
        channel.setRadioChannel(9);
        channel.radioChannelSwitchNext();
        int expected = 0;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки переключения каналла вниз
    public void radioChannelSwitchPrev() {
        Radio channel = new Radio();
        channel.setRadioChannel(5);
        channel.radioChannelSwitchPrev();
        int expected = 4;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест кнопки переключения каналла вниз
    public void radioChannelSwitchPrevMin() {
        Radio channel = new Radio();
        channel.setRadioChannel(0);
        channel.radioChannelSwitchPrev();
        int expected = 9;
        int actual = channel.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }
}