import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadQ {
  public static QTree read(int T) {
   QTree btree = new QTree(T);
    try {
      // Create a FileReader object that reads from the file "Players.txt"
      FileReader reader = new FileReader("Questions.txt");

      // Create a BufferedReader object that wraps the FileReader object
      BufferedReader bufferedReader = new BufferedReader(reader);
       

      // Read the contents of the file line by line
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        // Split the line into fields separated by a comma
        String[] fields = line.split(",");

        // Parse the fields and add a new player to the BTree
        if (fields.length == 7){
        String text=fields[0];
        String opt1=fields[1];
        String opt2=fields[2];
        String opt3=fields[3];
        String opt4=fields[4];
        String rasp=fields[5];
        Integer id=Integer.parseInt(fields[6]);
         btree.Insert(new Question(text, opt1,opt2,opt3,opt4,id,rasp));
      }
      }

      // Close the BufferedReader
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return btree;
  }
}
