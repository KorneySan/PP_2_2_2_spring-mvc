package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> listCarsFirst(int count) {
        List<Car> carsList = Car.getCarsList();
        int realCount = count > carsList.size() ? carsList.size() : count;
        return carsList.subList(0, realCount);
    }
}
