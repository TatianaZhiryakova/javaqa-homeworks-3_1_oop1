package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    //Выставили номер радиостанции в пределах max min
    @Test
    public void shouldNewRadioStationNumber() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Выставили номер радиостанции > max
    @Test
    public void shouldNewRadioStationNumberMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Выставили номер радиостанции < min
    @Test
    public void shouldNewRadioStationNumberMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Добавление номера радиостанции в пределах max min (нажатие next)
    @Test
    public void shouldNextRadioStationNumber() {
        Radio radioStation = new Radio();
        radioStation.nextRadioStationNumber();
        int expected = 1;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Добавление номера с переходом за пределы max (нажатие next)
    @Test
    public void shouldNextRadioStationNumberMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(9);
        radioStation.nextRadioStationNumber();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Уменьшение номера радиостанции в пределах Max Min (нажатие prev)
    @Test
    public void shouldPrevRadioStationNumber() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(8);
        radioStation.prevRadioStationNumber();

        int expected = 7;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Уменьшение номера с переходом за пределы min
    @Test
    public void shouldPrevRadioStationNumberMin() {
        Radio radioStation = new Radio();
        radioStation.prevRadioStationNumber();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

//    Выставляем уровень громкости > max
    @Test
    public void shouldSetCurrentSoundVolumeMax (){
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(12);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //    Выставляем уровень громкости < min
    @Test
    public void shouldSetCurrentSoundVolumeMin (){
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(-5);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Увеличение громкости в пределах max min
    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Увеличение громкости с переходом за пределы max
    @Test
    public void shouldIncreaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Уменьшение громкости в пределах max min
    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(5);
        volume.decreaseVolume();

        int expected = 4;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Уменьшение громкости с переходом за пределы min
    @Test
    public void shouldDecreaseVolumeMin() {
        Radio volume = new Radio();
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

}