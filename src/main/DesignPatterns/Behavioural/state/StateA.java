package state;

public class StateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Handling using state A");
        context.setCurrentState(new StateB());
    }
}
