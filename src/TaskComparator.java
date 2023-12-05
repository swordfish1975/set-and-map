import java.util.Comparator;

// сравниватель задач
public class TaskComparator implements Comparator<Task> {


  @Override
  public int compare(Task task1, Task task2) {
    return task1.getTime().compareTo(task2.getTime());
  }
}
