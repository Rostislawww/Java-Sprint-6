public class Main {
  public static void main(String[] args) {
    HelloAnnotationsExercise exercise = new HelloAnnotationsExercise();
    Exercise exerciseAnnotation = exercise
      .getClass()
      .getAnnotation(Exercise.class);
    if (exerciseAnnotation != null) {
      System.out.println("Exercise Name: " + exerciseAnnotation.exerciseName());
      System.out.println(
        "Complexity Level: " + exerciseAnnotation.complexityLevel()
      );
    } else {
      System.out.println(
        "HelloAnnotationsExercise is not annotated with @Exercise"
      );
    }
  }
}
