package designpattern.startegypattern.WithStartegyDesingPattern.vehicle;

import designpattern.startegypattern.WithStartegyDesingPattern.strategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
