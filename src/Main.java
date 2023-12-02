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

    // метод clear -очищение коллекции
    todoList.clear();
    // метод isEmpty() - возвращает true если коллекция пустая
    if (todoList.isEmpty()) {
      System.out.println("Коллекция пустая");
    } else {
      System.out.println("Коллекция не пустая");
    }

  }
  public static void printTodoList (HashSet<String> todoList) {
    for(String item: todoList) {
      System.out.println(item);
    }
  }

}
