package lib;
import java.util.ArrayList;

public class MeArrays {
    ArrayList<String> cars = new ArrayList<String>();
    public void addItem(String type) {
        this.cars.add(type);
    }
    public ArrayList<String> getItems() {
        return this.cars;
    }
}
