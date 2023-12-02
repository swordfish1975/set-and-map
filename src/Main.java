import java.util.ArrayList;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    HashSet<Task> todoList = new HashSet<>();
    todoList.add(new Task("Купить молоко"));
    todoList.add(new Task("Купить лошадь"));
    todoList.add(new Task("Покормить кота"));
    todoList.add(new Task("Купить лошадь"));
    todoList.add(new Task("Купить молоко"));

    printTodoList(todoList);

    System.out.println("Размер коллекции = " + todoList.size());

  }
  public static void printTodoList (HashSet<Task> todoList) {
    for(Task task: todoList) {
      System.out.println(task);
    }
  }

}
