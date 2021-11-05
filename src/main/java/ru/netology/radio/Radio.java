package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;
    int minNumber = 0;
    int maxNumber = 9;
    int minVolume = 0;
    int maxVolume = 10;


    //Выставляем номер радиостанции
    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minNumber) {
            return;
        }
        if (newRadioStationNumber > maxNumber) {
            return;
        } else {
            currentRadioStationNumber = newRadioStationNumber;
        }
    }

    //Увеличение на 1 станцию
    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < maxNumber) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        if (currentRadioStationNumber == maxNumber) {
            currentRadioStationNumber = minNumber;
        }
    }

    //Уменьшение на 1 станцию
    public void prevRadioStationNumber() {

        if (currentRadioStationNumber > minNumber) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber == minNumber) {
            currentRadioStationNumber = maxNumber;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    //Выставляем уровень громкости
    public void setCurrentSoundVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
         else {
            currentSoundVolume = newVolume;
        }
    }

    //Увеличение громкости на 1
    public void increaseVolume() {
        if (currentSoundVolume < maxVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume == maxVolume) {
            return;
        }
    }

    //Уменьшение громкости на 1
    public void decreaseVolume() {

        if (currentSoundVolume > minVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        if (currentSoundVolume == minVolume) {
            return;
        }
    }

    public int getCurrentSoundVolume(){
        return currentSoundVolume;
    }

}
