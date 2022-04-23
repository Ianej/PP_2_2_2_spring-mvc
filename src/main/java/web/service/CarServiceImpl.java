package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCarList(int count) {
        Car car = new Car();
        List<Car> cars = car.getCars();
        List<Car> list = new ArrayList<>();
        count = count < 5 && count > 0 ? count : 5;
        for(int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        System.out.println("CarServiceImpl экземпляр");
        return list;
    }
}
