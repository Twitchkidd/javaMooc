import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> todos;

  public TodoList() {
    this.todos = new ArrayList<>();
  }

  public void add(String task) {
    this.todos.add(task);
  }

  public void print() {
    for (String todo : this.todos) {
      System.out.println((this.todos.indexOf(todo) + 1) + ": " + todo);
    }
  }

  public void remove(int index) {
    this.todos.remove(index - 1);
  }
}
