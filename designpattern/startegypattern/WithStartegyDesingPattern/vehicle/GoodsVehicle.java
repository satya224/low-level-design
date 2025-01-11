package designpattern.startegypattern.WithStartegyDesingPattern.vehicle;

import designpattern.startegypattern.WithStartegyDesingPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
