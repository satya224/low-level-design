package designpattern.startegypattern.WithStartegyDesingPattern.vehicle;

import designpattern.startegypattern.WithStartegyDesingPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
