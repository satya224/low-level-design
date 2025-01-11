package designpattern.startegypattern.WithStartegyDesingPattern.vehicle;

import designpattern.startegypattern.WithStartegyDesingPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
