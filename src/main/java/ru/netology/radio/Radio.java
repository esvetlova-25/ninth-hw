package ru.netology.radio;

public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setIncreaseVolume() {
        if (currentVolume < 101) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave > 9) {
            return;
        }
        if (newCurrentWave < 0) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setToMaxWave() {
        currentWave = 9;
    }

    public void setToMinWave() {
        currentWave = 0;
    }

    public void setWaveNextMax() {

        if (currentWave < 9) {
            currentVolume = currentVolume + 1;
        } else {
            currentWave = 0;
        }
    }

    public void setWavePrevMin() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentWave = 9;
        }
    }

    public void setIncreaseWave() {
        if (currentWave < 10) {
            currentWave = currentWave + 1;
        }
    }

    public void setDecreaseWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        }
    }

}