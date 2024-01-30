package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinVolume() {
        Radio radio = new Radio();
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxVolume() {
        Radio radio = new Radio();
        radio.getMaxVolume();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentStation() {
        Radio radio = new Radio();
        radio.getCurrentStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinStation() {
        Radio radio = new Radio();
        radio.getMinStation();
        int expected = 0;
        int actual = radio.getMinStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxStation() {
        Radio radio = new Radio();
        radio.getMaxStation();
        int expected = 10;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        int expected = 30;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
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
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
