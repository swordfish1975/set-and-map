

public class Main {

  public static void main(String[] args) {
    Basket basket = new Basket();
    basket.add(new Product("Молоко", 300), 20);
    basket.add(new Product("Масло", 50), 10);
    basket.add(new Product("Молоко", 300), 30);
    System.out.println(basket);

  }

}
