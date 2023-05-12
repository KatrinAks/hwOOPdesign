public class Radio {
    private int currentStation;
    private int countStation;
    private int maxStation;
    public int currentVolume;

    public Radio(int countStations) {
        this.maxStation = countStations - 1;
    }

    public Radio() {
        this.maxStation = 9;


    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setLimitStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;

        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int getPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setLimitVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }


}

