package observer;

import observer.observers.ComputerDisplay;
import observer.observers.Observer;
import observer.observers.PhoneDisplay;

public class App {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay();
        Observer computerDisplay = new ComputerDisplay();
        weatherStation.addObserver(computerDisplay);
        weatherStation.addObserver(phoneDisplay);


        weatherStation.setTemperature(100.50); //As soon as this is called, all the observers would be notified
    }
}
