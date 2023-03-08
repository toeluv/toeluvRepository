package mpei.ru.carservice.service;

import mpei.ru.carservice.model.Car;

public interface CarService {
    void saveCar(Car car);

    Car getCar (String model);

}
