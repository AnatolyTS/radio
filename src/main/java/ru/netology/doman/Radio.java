package ru.netology.doman;

public class Radio {
    int currentStation;
    int currentVolume;
    int maxStation = 10;
    int minStation = 0;
    int maxVolumte = 100;
    int minVolume = 0;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextCurrentStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prevCurrentStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolumte) {
            this.currentVolume = maxVolumte;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolumte) {
            currentVolume++;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolumte() {
        return maxVolumte;
    }

    public void setMaxVolumte(int maxVolumte) {
        this.maxVolumte = maxVolumte;
    }

    public int getMinVoume() {
        return minVolume;
    }

    public void setMinVoume(int minVoume) {
        this.minVolume = minVoume;
    }
}
