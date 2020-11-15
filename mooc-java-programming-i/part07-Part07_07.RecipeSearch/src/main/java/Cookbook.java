import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Cookbook {
  private ArrayList<Recipe> recipes;

  public Cookbook(String file) {
    this.recipes = new ArrayList<>();
    try (Scanner fScanner = new Scanner(Paths.get(file))) {
      boolean started = false;
      boolean nameTaken = false;
      boolean cookTimeTaken = false;
      String tmpName = "";
      int tmpCookTime = 0;
      ArrayList<String> tmpIngredients = new ArrayList<>();
      while (fScanner.hasNextLine()) {
        String next = fScanner.nextLine();
        // you should use a for loop here, until i > 2 && hasNextLine tests
        if (next.isEmpty()) {
          if (!fScanner.hasNextLine()) {
            break;
          }
          started = false;
          continue;
        }
        if (started == false) {
          started = true;
          tmpName = next;
          nameTaken = true;
          continue;
        }
        if (nameTaken == true && cookTimeTaken == false) {

        }

      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
