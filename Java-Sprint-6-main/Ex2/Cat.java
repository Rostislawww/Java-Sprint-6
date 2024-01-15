import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Cat {

  public static void main(String[] args) {
    File inputFile = new File("example.txt");
    cat(inputFile);
  }

  public static void cat(File file) {
    RandomAccessFile input = null;
    String line = null;
    try {
      input = new RandomAccessFile(file, "r");
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException fnfe) {
      System.err.format("File: %s not found%n", file);
    } catch (IOException io) {
      System.err.println(
        "An error occurred while reading the file: " + io.getMessage()
      );
    } finally {
      if (input != null) {
        try {
          input.close();
        } catch (IOException io) {
          System.err.println(
            "An error occurred while closing the file: " + io.getMessage()
          );
        }
      }
    }
  }
}
