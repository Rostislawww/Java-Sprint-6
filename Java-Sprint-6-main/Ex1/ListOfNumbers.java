import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {
    private static final int SIZE = 10;
    private List<Integer> list;

    public ListOfNumbers() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(i);
        this.readList("InputNum.txt");
        this.writeList();
    }

    public void readList(String fileName) {
        String line = null;
        RandomAccessFile raf = null;
    
        try {
            raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    Integer i = Integer.parseInt(line);
                    list.add(i);
                }
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("File: " + fileName + " not found.");
        } catch (NumberFormatException nfe) {
            System.err.println("NumberFormatException: " + nfe.getMessage());
        } catch (IOException io) {
            System.err.println(io.toString());
        }
    }
    

     public void writeList() {
         PrintWriter out = null;
         try {
             out = new PrintWriter(new FileWriter("OutFile.txt"));
             for (int i = 0; i < list.size(); i++)
             out.println("Value at: " + i + " = " + list.get(i));
         } catch (IndexOutOfBoundsException e) {
             System.err.println("Caught IndexOutOfBoundsException: " +
                                  e.getMessage());
         } catch (Exception e) {
             System.err.println("Caught Exception: " + e.getMessage());
         } 
         finally {
             if (out != null) {
                 System.out.println("PrintWriter - Done");
                 out.close();
             } else {
                 System.out.println("PrintWriter not open");
             }
         }
     }

     public static void main(String[] args) {
        new ListOfNumbers();
    }
}
