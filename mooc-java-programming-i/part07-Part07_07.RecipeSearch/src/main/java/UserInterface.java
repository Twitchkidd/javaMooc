import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;

  public UserInterface(Scanner scanner) {
    this.scanner = scanner;
  }

  public void start() {
    System.out.print("File to read: ");
    String file = scanner.nextLine();
    Cookbook cookbook = new Cookbook(file);
    while (true) {
      System.out.println("Commands:");
      System.out.println("list - lists the recipes");
      System.out.println("stop - stops the program");
      System.out.println("find name - searches repies by name");
      System.out.println("find cooking time - searches repies by cooking time");
      System.out.println("find ingredient - searches repies by ingredient");
      System.out.println("");
      System.out.print("Enter command: ");
      String command = scanner.nextLine();
      if (command.equals("stop")) {
        break;
      }
      if (command.equals("list")) {
        System.out.println("");
        cookbook.list();
      }
      if (command.equals("find name")) {
        System.out.print("Searched word: ");
        String search = scanner.nextLine();
        System.out.println("");
        cookbook.nameSearch(search);
      }
      if (command.equals("find cooking time")) {
        System.out.print("Max cooking time: ");
        Integer searchTime = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        cookbook.cookingTimeSearch(searchTime);
      }
      if (command.equals("find ingredient")) {
        System.out.print("Ingredient: ");
        String search = scanner.nextLine();
        System.out.println("");
        cookbook.ingredientSearch(search);
      }
    }
  }
}
