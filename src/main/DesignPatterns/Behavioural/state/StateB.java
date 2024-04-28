package state;

public class StateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Handling using StateB");
        context.setCurrentState(new StateA());
    }
}
