package designpattern.startegypattern.WithStartegyDesingPattern.vehicle;

import designpattern.startegypattern.WithStartegyDesingPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
