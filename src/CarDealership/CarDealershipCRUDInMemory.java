package CarDealership;

import Car.Car;

public class CarDealershipCRUDInMemory extends CarDealershipCRUDRepo{
    @Override
    public Car getCar(int i){
        return super.carList[i];
    }

    @Override
    public void delCar(int i){
        Car car = super.carList[i];
        super.carList[i] = super.carList[super.carList.length];
        super.carList = new Car[super.carList.length-1];
    }

    @Override
    public void insertCar(Car car){
        Car[] temp = new Car[super.carList.length+1];
        System.arraycopy(super.carList, 0, temp, 0, super.carList.length);
        temp[super.carList.length] = car;
        super.carList = temp;
    }

    @Override
    public void loadCars(){
        super.carList = new Car[2];
        Car Logan = new Car("Dacia", "Logan", 2006, 2000);
        Car Megane = new Car("Renault", "Megane", 2005, 3000);
        super.carList[0] = Logan;
        super.carList[1] = Megane;
    }
}
