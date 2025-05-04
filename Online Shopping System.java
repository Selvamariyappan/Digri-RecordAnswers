import java.util.Scanner;

abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = Math.max(0, price); 
    }

    public abstract double calculateDiscount();
    public abstract void displayDetails();
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;    
    }

    @Override
    public void displayDetails() {
        System.out.println("Details of " + name + ":");
        System.out.println("Product: " + name);
        System.out.printf("Price: $%.1f\n", price);
        System.out.printf("Discounted Price: $%.1f\n", price - calculateDiscount());
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; 
    }

    @Override
    public void displayDetails() {
        System.out.println("Details of " + name + ":");
        System.out.println("Product: " + name);
        System.out.printf("Price: $%.1f\n", price);
        System.out.printf("Discounted Price: $%.1f\n", price - calculateDiscount());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String electronicName = scanner.nextLine();
        double electronicPrice = scanner.nextDouble();
        scanner.nextLine(); 

        String clothingName = scanner.nextLine();
        double clothingPrice = scanner.nextDouble();

        Product electronic = new Electronics(electronicName, electronicPrice);
        Product clothing = new Clothing(clothingName, clothingPrice);

        electronic.displayDetails();
        System.out.println();
        clothing.displayDetails();

        scanner.close();
    }
}