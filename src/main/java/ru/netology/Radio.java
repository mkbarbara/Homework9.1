package ru.netology;

public class Radio {
    private int numberStation;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
        this.numberStation = 10;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numberStation - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentStation == numberStation - 1) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(numberStation - 1);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}