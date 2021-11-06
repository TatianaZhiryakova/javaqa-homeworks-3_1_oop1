package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber = 3; //текущая станция
    private int currentSoundVolume = 10;
    private int numberOfRadioStations = 10; //количество радио станций
    private int minNumber = 0;
    private int maxNumber = numberOfRadioStations + minNumber - 1;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int currentRadioStationNumber, int numberOfRadioStations) {
        this.currentRadioStationNumber = currentRadioStationNumber;
        if (numberOfRadioStations > 0) {
            this.numberOfRadioStations = numberOfRadioStations;
            this.maxNumber = numberOfRadioStations + minNumber - 1;
        }
    }

    public Radio(int numberOfRadioStations) {
        if (numberOfRadioStations > 0) {
            this.numberOfRadioStations = numberOfRadioStations;
            this.maxNumber = numberOfRadioStations + minNumber - 1;
        }
    }

    public Radio(int currentSoundVolume, int minVolume, int maxVolume) {
        this.currentSoundVolume = currentSoundVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

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

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

}
