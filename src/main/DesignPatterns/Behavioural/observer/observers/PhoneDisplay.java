package observer.observers;

public class PhoneDisplay implements Observer{
    @Override
    public void update(double temperature) {
        System.out.println("Phone Display: Temperature is: "+temperature);
    }
}
