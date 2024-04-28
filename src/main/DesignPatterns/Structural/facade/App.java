package facade;

import composite.Composite;
import facade.ComputerFacade;

public class App {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}
