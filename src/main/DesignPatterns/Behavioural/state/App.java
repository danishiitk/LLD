package state;

public class App {
    public static void main(String[] args) {
        Context context = new Context(new StateA());
        //Handle using State A, since initialized with A
        context.request();
        //State A will change the currentState to StateB
        context.request();
    }
}
