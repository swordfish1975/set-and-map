import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    TreeSet<Task> todoList = new TreeSet<>();
    todoList.add(new Task("Купить молоко"));
    todoList.add(new Task("Купить лошадь"));
    todoList.add(new Task("Покормить кота"));
    todoList.add(new Task("Купить лошадь"));
    todoList.add(new Task("Купить молоко"));

    printTodoList(todoList);

    System.out.println("Размер коллекции = " + todoList.size());

  }
  public static void printTodoList (TreeSet<Task> todoList) {
    for(Task task: todoList) {
      System.out.println(task);
    }
  }

}
