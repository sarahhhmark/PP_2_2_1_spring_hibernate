package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;

import java.util.List;

public class CarServiceImp implements CarService{
    private CarDao carDao;
    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
