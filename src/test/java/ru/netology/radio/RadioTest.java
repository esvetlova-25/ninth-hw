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
    public void shouldNotSetVolumeAboveMax() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(101);
        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(-1);
        int expected = 0;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(50);
        receiver.setIncreaseVolume();
        int expected = 51;
        int actual = receiver.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio receiver = new Radio();
        receiver.setCurrentVolume(50);
        receiver.setDecreaseVolume();
        int expected = 49;
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
    public void shouldNotSetWavePrevMin() {
        Radio receiver = new Radio();
        receiver.setCurrentWave(0);
        receiver.setWavePrevMin();
        int expected = 9;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseWave() {
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
        receiver.setCurrentWave(3);
        receiver.setDecreaseWave();
        int expected = 2;
        int actual = receiver.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
}

