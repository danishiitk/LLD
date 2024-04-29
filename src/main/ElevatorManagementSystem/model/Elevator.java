package model;

public class Elevator {
    int number;
    State currentState;
    Floor currentFloor;
    Floor destinationFloor;
    public Elevator(int number){
        this.number = number;
        currentFloor = Floor.GROUND;
        currentState = State.PAUSED;
    }
    public boolean moveToFloor(Floor toMoveFloor){
        if(currentState == State.PAUSED){
            destinationFloor = toMoveFloor;
            System.out.println("Moving to: "+ toMoveFloor);
            return true;
        } else if(currentState == State.RUNNING){
            //wait and first move to the destination floor
            //after that destination floor = toMoveFloor and move
            return true;
        } else{
            System.out.println("Lift Not working");
            return false;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Floor currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Floor getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(Floor destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
}
