package tddmicroexercises.tirepressuremonitoringsystem;

public class SensorFake extends Sensor {

    double fakePressure = 0;

    public double popNextPressurePsiValue() {
        return fakePressure;
    }
}
