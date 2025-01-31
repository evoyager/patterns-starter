package refactoring_guru.creational.builder;

import refactoring_guru.creational.builder.builders.CarBuilder;
import refactoring_guru.creational.builder.builders.CarManualBuilder;
import refactoring_guru.creational.builder.cars.Car;
import refactoring_guru.creational.builder.cars.Manual;
import refactoring_guru.creational.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("Car manual built:\n" + carManual.print());

    }
}
