import java.util.Scanner;

public class TextUI {
  private Scanner scan;
  private SimpleDictionary simpleDictionary;

  public TextUI(Scanner scan, SimpleDictionary simpleDictionary) {
    this.scan = scan;
    this.simpleDictionary = simpleDictionary;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scan.nextLine();
      if (command.equals("end")) {
        break;
      }
      if (command.equals("add")) {
        System.out.print("Word: ");
        String word = scan.nextLine();
        System.out.print("Translation: ");
        String translation = scan.nextLine();
        this.simpleDictionary.add(word, translation);
        continue;
      }
      if (command.equals("search")) {
        System.out.print("To be translated: ");
        String translate = scan.nextLine();
        if (this.simpleDictionary.translate(translate) == null) {
          System.out.println("Word " + translate + " was not found");
        } else {
          System.out.println("Translation: " + this.simpleDictionary.translate(translate));
        }
        continue;
      }
      System.out.println("Unknown command");
    }
    System.out.println("Bye bye!");
  }
}