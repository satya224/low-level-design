package designpattern.startegypattern.WithStartegyDesingPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("with strategy sports drive capability");
    }
}
