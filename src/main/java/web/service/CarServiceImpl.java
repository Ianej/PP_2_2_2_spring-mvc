package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private static final CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> getCarList(int count) {
        System.out.println("CarServiceImpl экземпляр");
        return carDao.getCarList(count);
    }
}
