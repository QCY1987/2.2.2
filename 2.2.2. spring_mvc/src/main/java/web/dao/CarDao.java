package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    public List<Car> cars () {

    List<Car> cars=new ArrayList<>();
    cars.add(new Car(1,"BMV",5));
    cars.add(new Car(2,"JEEP",2));
    cars.add(new Car(3,"VOLVO",70));
    cars.add(new Car(4,"LADA",10));
    cars.add(new Car(5,"OPEL",3));
return cars;

    }
}
