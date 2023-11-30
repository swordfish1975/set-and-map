import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> todoList = new ArrayList<>();
    todoList.add("Купить молоко");
    todoList.add("Купить лошадь");
    todoList.add("Покормить кота");
    todoList.add("Купить лошадь");
    todoList.add("Купить молоко");

    printTodoList(todoList);

  }
  public static void printTodoList (ArrayList<String> todoList) {
    for(String item: todoList) {
      System.out.println(item);
    }
  }

}
