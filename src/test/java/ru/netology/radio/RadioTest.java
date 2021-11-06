package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio volume = new Radio();


    //Устанавливаем кол-во радиостанций
    @Test
    public void shouldNumberOfRadioStations() {
        Radio radioStation = new Radio(12);
        assertEquals(12, radioStation.getNumberOfRadioStations());
    }

    //Устанавливаем кол-во станций меньше мининума
    @Test
    public void shouldNumberOfRadioStationsMin() {
        Radio radioStation = new Radio(-1);
        assertEquals(10, radioStation.getNumberOfRadioStations());
    }

    //Устанавливаем кол-во станций меньше мининума для второго конструктора
    @Test
    public void shouldNumberOfRadioStationsMin2() {
        Radio radioStation = new Radio(5,-1);
        assertEquals(10, radioStation.getNumberOfRadioStations());
    }

    //Номер Max радиостанции изменяется в зависимости от кол-ва радиостанций
    @Test
    public void shouldNumberOfRadioStationsAndMaxRadioNumber() {
        Radio radioStation = new Radio(8, 15);
        assertEquals(14, radioStation.getMaxNumber());
    }

    //Создаем объект с кол-вом станций и выставляем номер радиостанции в пределах max min
    @Test
    public void shouldNewRadioStationNumber() {
        Radio radioStation = new Radio(7, 10);
        radioStation.setCurrentRadioStationNumber(7);
        assertEquals(7, radioStation.getCurrentRadioStationNumber());
    }

    //Создаем объект с кол-вом станций и выставляем номер радиостанции > max/Ожидаемый результат: номер станции не переключится, останется дефолтный
    @Test
    public void shouldNewRadioStationNumberMax() {
        Radio radioStation = new Radio(8, 10);
        radioStation.setCurrentRadioStationNumber(20);
        assertEquals(8, radioStation.getCurrentRadioStationNumber());
    }

    //Создаем объект с кол-вом станций и выставляем номер радиостанции < min/Ожидаемый результат: номер станции не переключится, останется дефолтный
    @Test
    public void shouldNewRadioStationNumberMin() {
        Radio radioStation = new Radio(6, 10);
        radioStation.setCurrentRadioStationNumber(-1);
        assertEquals(6, radioStation.getCurrentRadioStationNumber());
    }

    //Добавление номера радиостанции в пределах max min (нажатие next)
    @Test
    public void shouldNextRadioStationNumber() {
        Radio radioStation = new Radio(6, 10);
        radioStation.nextRadioStationNumber();
        assertEquals(7, radioStation.getCurrentRadioStationNumber());
    }

    //Добавление номера станции с переходом за пределы max (нажатие next)
    @Test
    public void shouldNextRadioStationNumberMax() {
        Radio radioStation = new Radio(16, 17);
        radioStation.nextRadioStationNumber();
        assertEquals(0, radioStation.getCurrentRadioStationNumber());
    }

    //Уменьшение номера радиостанции в пределах Max Min (нажатие prev)
    @Test
    public void shouldPrevRadioStationNumber() {
        Radio radioStation = new Radio(5, 10);
        radioStation.prevRadioStationNumber();
        assertEquals(4, radioStation.getCurrentRadioStationNumber());
    }

    //Уменьшение номера с переходом за пределы min
    @Test
    public void shouldPrevRadioStationNumberMin() {

        Radio radioStation = new Radio(0, 10);
        radioStation.prevRadioStationNumber();
        assertEquals(9, radioStation.getCurrentRadioStationNumber());
    }


    //Увеличение громкости в пределах max min
    @Test
    public void shouldIncreaseVolume() {
        volume.increaseVolume();
        assertEquals(11, volume.getCurrentSoundVolume());
    }

    //Увеличение громкости с переходом за пределы max
    @Test
    public void shouldIncreaseVolumeMax() {
        Radio volume = new Radio(120, 0, 120);
        volume.increaseVolume();
        assertEquals(120, volume.getCurrentSoundVolume());
    }

    //Уменьшение громкости в пределах max min
    @Test
    public void shouldDecreaseVolume() {
        volume.decreaseVolume();
        assertEquals(9, volume.getCurrentSoundVolume());
    }

    //Уменьшение громкости с переходом за пределы min
    @Test
    public void shouldDecreaseVolumeMin() {
        Radio volume = new Radio(0, 0, 120);
        volume.decreaseVolume();
        assertEquals(0, volume.getCurrentSoundVolume());
    }

}