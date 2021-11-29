package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    List<Car> carsList = new ArrayList<>();

    {// блок инициализации
        carsList.add(new Car("Nissan", "White", 1));
        carsList.add(new Car("BMW", "Black", 2));
        carsList.add(new Car("Mercedes-Benz", "Blue", 3));
        carsList.add(new Car("Kalina", "Brown", 4));
        carsList.add(new Car("Tesla", "Black", 5));
    }

    @Override
    public List<Car> getListCars() {
        return carsList;
    }

    @Override
    public List<Car> getListCarsByParam(Integer i) {

        if (i == 1) {
            return carsList.subList(0, 1);
        }
        if (i == 2) {
            return carsList.subList(0, 2);
        }
        if (i == 3) {
            return carsList.subList(0, 3);
        }
        if (i == 4) {
            return carsList.subList(0, 4);
        }
        if (i >= 5) {
            return carsList.subList(0, 5);
        }
        if (i <= 0) {
            return carsList.subList(0, 5);
        } else {
            return null;
        }

//        if (i <= 0) {
//            i = carsList.size();
//        }
//
//        return carsList.stream().limit(i).collect(Collectors.toList());

    }

}
