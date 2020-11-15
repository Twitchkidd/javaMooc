import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private Birds birds;

  public UserInterface(Scanner scanner) {
    this.scanner = scanner;
    this.birds = new Birds();
  }

  public void start() {
    while (true) {
      System.out.print("? ");
      String command = this.scanner.nextLine();
      if (command.equals("Quit"))
        break;
      if (command.equals("Add"))
        this.add();
      if (command.equals("Observation"))
        this.observation();
      if (command.equals("All"))
        this.all();
      if (command.equals("One"))
        this.one();
    }
  }

  private void add() {
    System.out.print("Name: ");
    String name = this.scanner.nextLine();
    System.out.print("Name in Latin: ");
    String nameInLatin = this.scanner.nextLine();
    boolean worked = this.birds.add(name, nameInLatin);
    if (!worked) {
      System.out.println("Can't add bird!");
    }
  }

  private void observation() {
    System.out.print("Bird? ");
    String bird = this.scanner.nextLine();
    boolean worked = this.birds.observation(bird);
    if (!worked) {
      System.out.println("Not a bird!");
    }
  }

  private void all() {
    ArrayList<Bird> birds = this.birds.all();
    for (Bird bird : birds) {
      System.out.println(bird);
    }
  }

  private void one() {
    System.out.print("Bird? ");
    String name = this.scanner.nextLine();
    Bird bird = this.birds.one(name);
    if (bird == null) {
      System.out.println("Not a bird!");
    } else {
      System.out.println(bird);
    }
  }
}
