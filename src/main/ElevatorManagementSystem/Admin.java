import controller.ElevatorController;
import model.Elevator;

public class Admin extends Account{
    String Address;
    String name;
    ElevatorController elevatorController = ElevatorController.getElevatorController();
    public void addElevator(Elevator elevator){
        elevatorController.addElevator(elevator);
    }
    public void removeElevator(Elevator elevator){
        elevatorController.removeElevator(elevator);
    }
}
