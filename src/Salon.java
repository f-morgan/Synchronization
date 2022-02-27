import java.util.ArrayList;
import java.util.List;

public class Salon {
    Seller seller = new Seller(this);
    List<Car> cars = new ArrayList<>(10);

    public Car sellCar() {
        return seller.sellCar();
    }

    public void receiveCar() {
        seller.receiveCar();
    }

    public List<Car> getCars() {
        return cars;
    }
}
