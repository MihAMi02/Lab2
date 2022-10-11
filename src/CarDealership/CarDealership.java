package CarDealership;

import Car.Car;

public class CarDealership {
    private final CarDealershipCRUDRepo repository;
    public CarDealership(CarDealershipCRUDRepo repository) {
        this.repository = repository;
        this.repository.loadCars();
    }

    public Car getCar(int i){
        return this.repository.getCar(i);
    }

    public void delCar(int i){
        this.repository.delCar(i);
    }

    public void addCar(Car car){
        this.repository.insertCar(car);
    }

    public int getLength(){
        return this.repository.carList.length;
    }

}
