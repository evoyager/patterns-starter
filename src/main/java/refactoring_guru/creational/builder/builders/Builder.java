package refactoring_guru.creational.builder.builders;

import refactoring_guru.creational.builder.cars.CarType;
import refactoring_guru.creational.builder.components.*;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
