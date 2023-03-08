package mpei.ru.carservice;

import org.springframework.web.bind.annotation.*;
import mpei.ru.carservice.data.DataRepository;
import mpei.ru.carservice.model.Car;
import mpei.ru.carservice.service.CarService;
@CrossOrigin
@RestController

public class CarServiceController {
    private final CarService carService;
    private final DataRepository repository;

    public CarServiceController(CarService carService, DataRepository repository) {
        this.carService = carService;
        this.repository = repository;
    }


    @PostMapping("save")
    public void saveCar (@RequestBody Car car){
        carService.saveCar(car);
        System.out.println("Метод post отработал");
    }

    @GetMapping("get")
    public Car getCar (@RequestParam String model) {
        System.out.println("Метод get отработал");
        return carService.getCar(model);
    }
}
