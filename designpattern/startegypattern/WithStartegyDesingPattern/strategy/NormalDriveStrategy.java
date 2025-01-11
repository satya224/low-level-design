package designpattern.startegypattern.WithStartegyDesingPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("with strategy normal drive capability");
    }
}
