package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarDaoImpl implements CarDao{
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
    @Override
    public List<Car> getCarList(int count) {
        List<Car> list = new ArrayList<>();
        count = count < 5 && count > 0 ? count : 5;
        if (count == 5) return cars;
        for(int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
