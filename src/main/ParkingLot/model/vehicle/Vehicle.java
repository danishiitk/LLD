package model.vehicle;

import model.ParkingTicket;

public abstract class Vehicle {
    VehicleType vehicleType;
    String licenseNumber;
    ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void assignTicket(ParkingTicket parkingTicket){
        this.parkingTicket = parkingTicket;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }
}
