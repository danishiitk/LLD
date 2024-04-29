package controller;

import model.Elevator;
import model.Floor;
import model.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevatorController {
    List<Elevator> elevators;
    private ElevatorController(){
        this.elevators = new ArrayList<>();
    }

    //make it singleton
    public static ElevatorController elevatorController;
    public static ElevatorController getElevatorController(){
        if(elevatorController == null){
            elevatorController = new ElevatorController();
        }
        return elevatorController;
    }

    public void addElevator(Elevator elevator) {
        this.elevators.add(elevator);
    }

    public void removeElevator(Elevator elevator) {
        this.elevators.remove(elevator);
    }

    public void comeToFloor(Floor comeToFloor){
        for(Elevator elevator: elevators){
            if(elevator.getCurrentState() == State.PAUSED){
                elevator.moveToFloor(comeToFloor);
                enterDestinationFloorAndMove(elevator);
                break;
            }
        }
    }

    private void enterDestinationFloorAndMove(Elevator elevator) {
        System.out.println("Please enter the destination floor: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        elevator.moveToFloor(Floor.valueOf(text));
    }

}
