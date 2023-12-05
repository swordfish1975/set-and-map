import java.util.HashMap;
import java.util.Map;

public class Basket {
  private HashMap<Product, Integer> products;

  public Basket() {
    this.products = new HashMap<>();
  }

  public void add (Product product, int count) {
    if (!products.containsKey(product)) {
      products.put(product, 0);
    }
    products.put(product, products.get(product) + count);
  }

  public void  add(Product product) {
    add(product, 1);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    // Первый способ вывести содержимое HashMap
//    for (Product product: products.keySet()){
//      builder.append(product);
//      builder.append(" - ");
//      builder.append(products.get(product));
//      builder.append("\n");
//    }
    // Второй способ вывести содержимое HashMap
    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
      Product product = entry.getKey();
      builder.append(product);
      builder.append(" - ");
      builder.append(entry.getValue());
      builder.append("\n");
    }
    return builder.toString();
  }
}
