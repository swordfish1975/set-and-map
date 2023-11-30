import java.util.ArrayList;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    HashSet<String> todoList = new HashSet<>();
    todoList.add("Купить молоко");
    todoList.add("Купить лошадь");
    todoList.add("Покормить кота");
    todoList.add("Купить лошадь");
    boolean horseAgain = todoList.add("Купить лошадь");
    System.out.println("Значение переменной при добавлении повторяющегося значения: "
        + horseAgain + "\n");
    todoList.add("Купить молоко");

    printTodoList(todoList);

  }
  public static void printTodoList (HashSet<String> todoList) {
    for(String item: todoList) {
      System.out.println(item);
    }
  }

}
