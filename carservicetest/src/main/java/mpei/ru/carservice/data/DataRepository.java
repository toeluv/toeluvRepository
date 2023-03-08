package mpei.ru.carservice.data;
import mpei.ru.carservice.model.Car;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DataRepository {
    private Map<String, Car> carMap = new HashMap<>();

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }
}
