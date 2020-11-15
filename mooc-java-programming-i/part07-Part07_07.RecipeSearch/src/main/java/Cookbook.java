import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Cookbook {
  private ArrayList<Recipe> recipes;

  public Cookbook(String file) {
    this.recipes = new ArrayList<>();
    try (Scanner fScanner = new Scanner(Paths.get(file))) {
      String name = "";
      int cookTime = 0;
      ArrayList<String> ingredients = new ArrayList<>();
      boolean timeRecorded = false;
      while (fScanner.hasNextLine()) {
        String next = fScanner.nextLine();
        if (next.isEmpty()) {
          if (!name.isEmpty()) {
            ArrayList<String> newIngredients = new ArrayList<String>(ingredients);
            this.recipes.add(new Recipe(name, cookTime, (ArrayList<String>) newIngredients));
          }
          name = "";
          ingredients.clear();
          timeRecorded = false;
          continue;
        }
        if (timeRecorded) {
          ingredients.add(next);
          continue;
        }
        if (!name.isEmpty()) {
          cookTime = Integer.valueOf(next);
          timeRecorded = true;
          continue;
        }
        name = next;
      }
      this.recipes.add(new Recipe(name, cookTime, ingredients));
      System.out.println("");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void list() {
    System.out.println("Recipes:");
    for (Recipe recipe : this.recipes) {
      System.out.println(recipe);
    }
    System.out.println("");
  }

  public void nameSearch(String search) {
    System.out.println("Recipes:");
    for (Recipe recipe : this.recipes) {
      if (recipe.getName().contains(search)) {
        System.out.println(recipe);
      }
    }
    System.out.println("");
  }

  public void cookingTimeSearch(int searchTime) {
    System.out.println("Recipes:");
    for (Recipe recipe : this.recipes) {
      if (searchTime >= recipe.getCookTime()) {
        System.out.println(recipe);
      }
    }
    System.out.println("");
  }

  public void ingredientSearch(String search) {
    System.out.println("Recipes:");
    for (Recipe recipe : this.recipes) {
      boolean gotIt = false;
      for (String ingredient : recipe.getIngredients()) {
        if (ingredient.equals(search)) {
          gotIt = true;
        }
      }
      if (gotIt) {
        System.out.println(recipe);
      }
    }
    System.out.println("");
  }
}
