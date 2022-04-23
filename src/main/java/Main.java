import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.getCarList(5);
        cars.stream().forEach(System.out::println);
        CarService carService1 = new CarServiceImpl();
        System.out.println("New Service");
        cars = carService1.getCarList(5);
        cars.stream().forEach(System.out::println);
    }
}

