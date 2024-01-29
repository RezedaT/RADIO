package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationOverMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStationOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationAfterMinOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxStationOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationBeforeMaxOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(14);

        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMaxOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(16);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGetNextStationBeforeMaxOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(13);

        int expected = 14;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxStationOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(14);

        int expected = 15;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterMinOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(0);

        int expected = 1;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxStationPrevMinOf15() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(0);

        int expected = 15;
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
    public void shouldGetVolumeUpOverMin() {
        Radio radio = new Radio();
        radio.currentVolume = 1;

        int expected = 2;
        int actual = radio.up();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeUpMax() {
        Radio radio = new Radio();
        radio.currentVolume = 100;

        int expected = 100;
        int actual = radio.up();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeUpBelowMax() {
        Radio radio = new Radio();
        radio.currentVolume = 98;

        int expected = 99;
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
    public void shouldGetVolumeDownOverMin() {
        Radio radio = new Radio();
        radio.currentVolume = 1;

        int expected = 0;
        int actual = radio.down();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeDownMax() {
        Radio rad = new Radio();
        rad.currentVolume = 100;

        int expected = 99;
        int actual = rad.down();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeDownBelowMax() {
        Radio rad = new Radio();
        rad.currentVolume = 99;

        int expected = 98;
        int actual = rad.down();

        Assertions.assertEquals(expected, actual);
    }
}
