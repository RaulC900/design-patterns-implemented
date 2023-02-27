package CreationalPatterns.CP3_Builder.builders;

import CreationalPatterns.CP3_Builder.cars.CarType;
import CreationalPatterns.CP3_Builder.components.Engine;
import CreationalPatterns.CP3_Builder.components.GPSNavigator;
import CreationalPatterns.CP3_Builder.components.Transmission;
import CreationalPatterns.CP3_Builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
