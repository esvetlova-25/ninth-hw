package ru.netology.radio;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = minVolume;

        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;

        }
    }


    private int maxWave = 9;
    private int minWave = 0;
    private int currentWave;
    private int quantityStations = 10;

    public Radio() {
    }

    public Radio(int size) {
        this.quantityStations = minWave + size;
    }


    public int getCurrentWave() {
        return currentWave;
    }

    public int getQuantityStations() {
        return quantityStations;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave > maxWave) {
            return;
        }
        if (newCurrentWave < minWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setToMaxWave() {
        currentWave = maxWave;
    }

    public void setToMinWave() {
        currentWave = minWave;
    }

    public void setWaveNextMax() {

        if (currentWave < maxWave) {
            currentWave = currentWave + 1;
        } else {
            currentWave = minWave;
        }
    }

    public void setWavePrevMin() {
        if (currentWave > minWave) {
            currentWave = currentWave - 1;
        } else {
            currentWave = maxWave;
        }
    }

    public void setIncreaseWave() {
        if (currentWave < maxWave) {
            currentWave = currentWave + 1;
        }

    }

    public void setDecreaseWave() {
        if (currentWave > minWave) {
            currentWave = currentWave - 1;
        }
    }

}