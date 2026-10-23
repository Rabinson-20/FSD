package Oct23;

public class RestaurantDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant p = new PizzaRestaurant();
        Restaurant b = new BurgerRestaurant();

        p.displayMenu();
        System.out.println("Total Bill: Rs. " + p.calculateBill());

        System.out.println();

        b.displayMenu();
        System.out.println("Total Bill: Rs. " + b.calculateBill());

	}

}

abstract class Restaurant {
    abstract void displayMenu();
    abstract double calculateBill();
}

class PizzaRestaurant extends Restaurant {
    void displayMenu() {
        System.out.println("Pizza Restaurant Menu:");
        System.out.println("Pizza - Rs. 250");
        System.out.println("Garlic Bread - Rs. 100");
    }

    double calculateBill() {
        return 250 + 100;
    }
}

class BurgerRestaurant extends Restaurant {
    void displayMenu() {
        System.out.println("Burger Restaurant Menu:");
        System.out.println("Burger - Rs. 150");
        System.out.println("French Fries - Rs. 80");
    }

    double calculateBill() {
        return 150 + 80;
    }
}

