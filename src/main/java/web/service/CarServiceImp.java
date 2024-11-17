package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota Corolla", "LE", 2021));
        cars.add(new Car("Honda Civic", "Sport", 2020));
        cars.add(new Car("Chevrolet Malibu", "LT", 2019));
        cars.add(new Car("Hyundai Sonata", "SEL", 2022));
        cars.add(new Car("Kia Optima", "EX", 2018));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
