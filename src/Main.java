import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

    HashMap<String, Car> cars = new HashMap<>();
    cars.put("A765MT77", new Car("A765MT77"));
    cars.put("E6370097", new Car("E6370097"));
    cars.put("У789КХ77", new Car("У789КХ77"));
    cars.put("Т372МН199", new Car("Т372МН199"));

    System.out.println(cars.get("E6370097"));
  }

}
