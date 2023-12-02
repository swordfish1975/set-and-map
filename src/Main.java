import java.util.ArrayList;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    HashSet<String> todoList = new HashSet<>();
    todoList.add("Купить молоко");
    todoList.add("Купить лошадь");
    todoList.add("Покормить кота");
    todoList.add("Купить лошадь");

    printTodoList(todoList);

    System.out.println("Размер коллекции = " + todoList.size());

  }
  public static void printTodoList (HashSet<String> todoList) {
    for(String item: todoList) {
      System.out.println(item);
    }
  }

}
