package ru.netology.doman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setTheDesiredStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int expect = 3;

        assertEquals(expect, radio.getCurrentStation());
    }

    @Test
    public void enlargeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextCurrentStation();
        int expect = 8;

        assertEquals(expect, radio.getCurrentStation());
    }

    @Test
    public void reduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevCurrentStation();
        int expect = 4;

        assertEquals(expect, radio.getCurrentStation());
    }

    @Test
    public void increaseStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        int expect = 0;

        assertEquals(expect, radio.getCurrentStation());
    }

    @Test
    public void reduceStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expect = 9;

        assertEquals(expect, radio.getCurrentStation());
    }

    @Test
    public void increaseTheStationOverTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(17);
        radio.nextCurrentStation();
        int expect = 0;

        assertEquals(expect, radio.getCurrentStation());
    }

    @Test
    public void reduceTheStationOverTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-11);
        radio.prevCurrentStation();
        int expect = 9;

        assertEquals(expect, radio.getCurrentStation());
    }


    @Test
    public void increaseSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseCurrentVolume();
        int expect = 5;

        assertEquals(expect, radio.getCurrentVolume());
    }

    @Test
    public void reduceSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseCurrentVolume();
        int expect = 8;

        assertEquals(expect, radio.getCurrentVolume());
    }

    @Test
    public void soundIncreaseOverTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        int expect = 10;

        assertEquals(expect, radio.getCurrentVolume());
    }

    @Test
    public void soundReductionOverTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseCurrentVolume();
        int expect = 0;

        assertEquals(expect, radio.getCurrentVolume());
    }


}