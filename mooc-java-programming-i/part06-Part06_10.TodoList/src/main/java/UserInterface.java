import java.util.Scanner;

public class UserInterface {
  private Scanner scan;
  private TodoList todos;

  public UserInterface(TodoList todos, Scanner scan) {
    this.scan = scan;
    this.todos = todos;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scan.nextLine();
      if (command.equals("stop")) {
        break;
      }
      if (command.equals("add")) {
        System.out.print("To add: ");
        String addMe = scan.nextLine();
        this.todos.add(addMe);
      }
      if (command.equals("list")) {
        this.todos.print();
      }
      if (command.equals("remove")) {
        System.out.print("Which one is removed? ");
        int which = Integer.valueOf(scan.nextLine());
        this.todos.remove(which);
      }
    }
  }
}
