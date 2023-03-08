package mpei.ru.carservice.service;
import mpei.ru.carservice.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mpei.ru.carservice.data.DataRepository;

@Service
public class CarServiceIm implements CarService {
    private final DataRepository dataRepository;
    @Autowired
    public CarServiceIm(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
    @Override
    public void saveCar(Car car) {
        dataRepository.getCarMap().put(car.getModel(), car);
    }
    @Override
    public Car getCar(String model) {
        return dataRepository.getCarMap().get(model);
    }
}
