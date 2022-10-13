package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{


    @Override
    public List<Car> listOfCar(Integer count) {
        List<Car> list1 = new ArrayList<>();
        list1.add(new Car("Vaz","Red","V6"));
        list1.add(new Car("Uaz","Green","V8"));
        list1.add(new Car("Kamaz","Blue","V12"));
        list1.add(new Car("Volga","White","V8"));
        list1.add(new Car("Taz","Black","V6"));
        switch (count) {
            case 1:
                return list1.stream().limit(1).toList();
            case 2:
                return list1.stream().limit(2).toList();
            case 3:
                return list1.stream().limit(3).toList();
            case 4:
                return list1.stream().limit(4).toList();
            default:
                return list1;
        }
    }
}
