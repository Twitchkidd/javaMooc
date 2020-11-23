import java.util.Scanner;

public class UserInterface {
  private TodoList todos;
  private Scanner scanner;

  public UserInterface(TodoList todos, Scanner scanner) {
    this.todos = todos;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scanner.nextLine();
      if (command.equals("stop")) {
        break;
      }
      if (command.equals("add")) {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.todos.add(task);
      }
      if (command.equals("list")) {
        this.todos.print();
      }
      if (command.equals("remove")) {
        System.out.print("Which one is removed? ");
        int which = Integer.valueOf(scanner.nextLine());
        this.todos.remove(which);
      }
    }
  }
}
