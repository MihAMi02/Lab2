import CarDealership.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarDealershipCRUDRepo repo = new CarDealershipCRUDInMemory();
        CarDealershipView view = new CarDealershipView();
        CarDealership model = new CarDealership(repo);
        CarDealershipController ctrl = new CarDealershipController(view, model);
        Scanner in = new Scanner(System.in);
        int menuType = 0;
        do {
            ctrl.updateView(menuType);
            menuType = in.nextInt();
            ctrl.updateView(0);
        } while (menuType >= 1 && menuType <= 3);
    }
}