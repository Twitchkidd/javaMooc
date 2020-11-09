import java.util.ArrayList;

public class ExerciseManagement {
  private ArrayList<Exercise> exercises;

  public ExerciseManagement() {
    this.exercises = new ArrayList<>();
  }

  public ArrayList<String> exerciseList() {
    ArrayList<String> list = new ArrayList<String>();
    for (Exercise exercise : this.exercises) {
      list.add(exercise.getName());
    }
    return list;
  }

  public void add(String exerciseName) {
    this.exercises.add(new Exercise(exerciseName));
  }

  public void markAsCompleted(String exerciseName) {
    for (Exercise exercise : this.exercises) {
      if (exercise.getName().equals(exerciseName)) {
        exercise.setCompleted(true);
      }
    }
  }

  public boolean isCompleted(String exerciseName) {
    for (Exercise exercise : this.exercises) {
      if (exercise.getName().equals(exerciseName)) {
        return exercise.isCompleted();
      }
    }
    return false;
  }
}
