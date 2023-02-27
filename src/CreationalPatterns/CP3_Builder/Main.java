package CreationalPatterns.CP3_Builder;

import CreationalPatterns.CP3_Builder.builders.CarBuilder;
import CreationalPatterns.CP3_Builder.builders.CarManualBuilder;
import CreationalPatterns.CP3_Builder.cars.Car;
import CreationalPatterns.CP3_Builder.cars.Manual;
import CreationalPatterns.CP3_Builder.directors.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
