package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio receiver = new Radio();

        receiver.setCurrentVolume(50);

        int expected = 50;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio receiver = new Radio();

        receiver.setCurrentVolume(-1);

        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNextMax() {
        Radio receiver = new Radio();

        receiver.setCurrentVolume(101);

        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio receiver = new Radio();
        receiver.setToMaxVolume();
        int expected = 100;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio receiver = new Radio();
        receiver.setToMinVolume();
        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseVolume() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(35);
        receiver.setIncreaseVolume();
        int expected = 36;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeNextMax() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(100);
        receiver.setIncreaseVolume();
        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(87);
        receiver.setDecreaseVolume();
        int expected = 86;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeBelowMin() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(0);
        receiver.setDecreaseVolume();
        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave() {
        Radio receiver = new Radio();

        receiver.setCurrentWave(5);

        int expected = 5;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveBelowMin() {
        Radio receiver = new Radio();

        receiver.setCurrentWave(-1);

        int expected = 0;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveNextMax() {
        Radio receiver = new Radio();

        receiver.setCurrentWave(10);

        int expected = 0;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxWave() {
        Radio receiver = new Radio();
        receiver.setToMaxWave();
        int expected = 9;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinWave() {
        Radio receiver = new Radio();
        receiver.setToMinWave();
        int expected = 0;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveNextMax() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(9);
        receiver.setWaveNextMax();
        int expected = 0;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveBeforeMax() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(8);
        receiver.setWaveNextMax();
        int expected = 9;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWavePrevMin() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(0);
        receiver.setWavePrevMin();
        int expected = 9;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveAfterMin() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(2);
        receiver.setWavePrevMin();
        int expected = 1;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseWaveNextMax() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(9);
        receiver.setIncreaseWave();
        int expected = 9;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseWaveOnBorder() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(3);
        receiver.setIncreaseWave();
        int expected = 4;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseWave() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(8);
        receiver.setDecreaseWave();
        int expected = 7;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseWaveOnBorder() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(0);
        receiver.setDecreaseWave();
        int expected = 0;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
}

