package state;

public class Context {
    State currentState;

    public Context(State currentState) {
        this.currentState = currentState;
    }

    public void request(){
        currentState.handle(this);
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
