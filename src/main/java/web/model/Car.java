package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private static String[] models = {"Oka", "Nadejda", "Granta", "Kalina", "Vesta", "Largus", "Priora", "Revolution"};
    private static String[] transmissions = {"Manual", "Automatic", "Semi-automatic"};

    private static List<Car> cars = new ArrayList<>();
    static {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setModel(models[random.nextInt(8)]);
            car.setTransmission(transmissions[random.nextInt(3)]);
            car.setEngineOutput(random.nextInt(150));
            cars.add(car);
            System.out.println("Car экземпляр " + (i + 1));
        }
    }

    private String model;
    private String transmission;
    private int engineOutput;
    public Car() {


    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getEngineOutput() {
        return engineOutput;
    }

    public void setEngineOutput(int engineOutput) {
        this.engineOutput = engineOutput;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "model -> " + model + " transmission -> " + transmission + " engineOutput -> " + engineOutput;
    }
}
