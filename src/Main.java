public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Supra mk5", "TOYOTA", 2019, 46981.0, "Red", 19);

        System.out.println(car1.toString());

        car1.sell(5);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("Red");
        car1.setPrice(50000.0);

        System.out.println(car1.toString());
    }
}
