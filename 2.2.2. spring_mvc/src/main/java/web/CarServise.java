package web;


import web.dao.CarDao;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServise {

    private final CarDao carsDao=new CarDao();

    public List<Car> getCars (Integer count) {
        List<Car> cars=carsDao.cars();
        int number=count != null&&count< cars.size() ? count : cars.size();
        return cars.subList(0, number);
    }
    }