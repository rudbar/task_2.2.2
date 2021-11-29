package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    List<Car> getListCars();
    List<Car> getListCarsByParam(Integer i);
}
