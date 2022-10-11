package CarDealership;

import Car.Car;

public class CarDealershipView {
    public void printMenu(){
        System.out.println("\n----------------------------");
        System.out.println("Car Dealership Software 2100");
        System.out.println("----------------------------");
        System.out.println("1 - Show Cars");
        System.out.println("2 - Add Car");
        System.out.println("3 - Delete Car\n");
    }

    public void printShowCarsHeader(){
        System.out.println("Make\tModel\tYear\tPrice");
    }

    public void printCars(Car car){
        System.out.println(car.getMake() + "\t" + car.getModel() + "\t" + car.getYear() + "\t" + car.getPrice());
    }

    public void carMakeMenu(){
        System.out.print("Make: ");
    }

    public void carModelMenu(){
        System.out.print("Model: ");
    }

    public void carYearMenu(){
        System.out.print("Year: ");
    }

    public void carPriceMenu(){
        System.out.print("Price: ");
    }

    public void carIndexMenu(){
        System.out.print("Specify index of car to delete: ");
    }
}
