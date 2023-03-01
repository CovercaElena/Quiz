import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
public static BTree readPlayersFile(int T) {
  BTree btree = new BTree(T);
  try (BufferedReader reader = new BufferedReader(new FileReader("Players.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
      // Split the line by the comma character
      String[] parts = line.split(",");
      // The first two elements are the name and password of the player
      String name = parts[0];
      String password = parts[1];
      // The remaining elements are the scores of the player
      List<Integer> scores = new ArrayList<>();
      for (int i = 2; i < parts.length; i++) {
        scores.add(Integer.parseInt(parts[i]));
      }
      // Add the player to the B-tree
      btree.Insert(new Player(name, password, scores));
    }
  } catch (IOException e) {
    e.printStackTrace();
  }
  return btree;
}

public static void main(String[] args)
{
BTree b=new BTree(3);
b=Read.readPlayersFile(3);
b.Show();
}
}