package ru.netology;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(9);
        } else {
            currentStation -= 1;
        }
    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
