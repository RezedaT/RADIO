package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetFirstStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetLastStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 1;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGetPrevStationBeforeFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationBeforeLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 8;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeUpMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        int expected = 1;
        int actual = radio.up();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeUpMax() {
        Radio radio = new Radio();
        radio.currentVolume = 10;

        int expected = 10;
        int actual = radio.up();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeDownMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        int expected = 0;
        int actual = radio.down();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeDownMax() {
        Radio radio = new Radio();
        radio.currentVolume = 10;

        int expected = 9;
        int actual = radio.down();

        Assertions.assertEquals(expected, actual);
    }
}

