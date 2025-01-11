package designpattern.startegypattern.WithStartegyDesingPattern;

import designpattern.startegypattern.WithStartegyDesingPattern.vehicle.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new GoodsVehicle());
        vehicleList.add(new OffRoadVehicle());
        vehicleList.add(new PassengerVehicle());
        vehicleList.add(new SportsVehicle());
        for(Vehicle vehicle : vehicleList) {
            vehicle.drive();
        }
    }
}
