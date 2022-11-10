import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Fiat", 120, 45000, 3));
        cars.add(new Car("Porsche", 300, 250000, 8));
        cars.add(new Car("Mercedes", 280, 200000, 7));
        cars.add(new Car("Ford", 220, 120000, 5));
        cars.add(new Car("Kia", 200, 80000, 4));

        Car carHighestPrice = cars.stream().max((car1, car2)->car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carHighestPrice);

        Car carLowestPrice = cars.stream().min((car1, car2)->car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carLowestPrice);
    }
}
