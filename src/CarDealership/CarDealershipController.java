package CarDealership;

import Car.Car;
import java.util.Scanner;

public class CarDealershipController {

    private CarDealershipView view;
    private CarDealership model;
    private int modelRepoLength;

    public CarDealershipController(CarDealershipView view, CarDealership model) {
        this.view = view;
        this.model = model;
        this.getLength();
    }

    public void addCar(Car car){
        this.model.addCar(car);
        this.getLength();
    }

    public void delCar(int i){
        this.model.delCar(i);
        this.getLength();
    }

    public Car getCar(int i){
        return this.model.getCar(i);
    }

    private void getLength(){
        this.modelRepoLength = this.model.getLength();
    }

    public void updateView(int menuType){
        if(menuType == 0)
            this.view.printMenu();
        if(menuType == 1){
            this.view.printShowCarsHeader();
            for(int i = 0; i < this.modelRepoLength; i++){
                this.view.printCars(this.getCar(i));
            }
        }
        if(menuType == 2){
            Scanner in = new Scanner(System.in);
            String make, model;
            int year, price;
            this.view.carMakeMenu();
            make = in.nextLine();
            this.view.carModelMenu();
            model = in.nextLine();
            this.view.carYearMenu();
            year = in.nextInt();
            this.view.carPriceMenu();
            price = in.nextInt();
            this.addCar(new Car(make, model, year, price));
        }
        if(menuType == 3){
            Scanner in = new Scanner(System.in);
            int index;
            this.view.carIndexMenu();
            index = in.nextInt();
            this.delCar(index);
        }
    }
}
