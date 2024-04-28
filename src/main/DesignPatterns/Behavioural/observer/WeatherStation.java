package observer;

import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    List<Observer> observers;

    double temperature;
    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature);
        }
    }
}
