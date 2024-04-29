import controller.ElevatorController;
import model.Elevator;
import model.Floor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.addElevator(new Elevator(1));
        while(true){
            System.out.println("Please enter your current floor: ");
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            ElevatorController elevatorController = ElevatorController.getElevatorController();
            elevatorController.comeToFloor(Floor.valueOf(text));
        }
    }
}
