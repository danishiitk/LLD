package observer.observers;

public class ComputerDisplay implements Observer{
    @Override
    public void update(double temperature) {
        System.out.println("Computer Display: Temperature is: "+temperature);
    }
}
