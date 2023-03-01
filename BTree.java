
// Searching a key on a B-tree in Java 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BTree {

  private int T;

  // Node creation
   public class Node {
    int n;
    Player key[] = new Player[2 * T - 1];  // <-- Change type to Player
    Node child[] = new Node[2 * T];
    boolean leaf = true;

    public int Find(Player k) {  // <-- Change argument type to Player
      for (int i = 0; i < this.n; i++) {
        if (this.key[i].name.equals(k.name)) {  // <-- Compare player names
          return i;
        }
      }
      return -1;
    };
  }

  public BTree(int t) {
    T = t;
    root = new Node();
    root.n = 0;
    root.leaf = true;
  }

  private Node root;
  


  // Recursive method to count the number of keys in the tree
  private int countKeys(Node x) {
    if (x == null) {
      return 0;
    }
    // Count the keys in the current node
    int count = x.n;
    // Recursively count the keys in the children of the node
    for (int i = 0; i <= x.n; i++) {
      count += countKeys(x.child[i]);
    }
    return count;
  }

  // Method to get the total number of keys in the tree
  public int getKeyCount() {
    return countKeys(root);
  }

         
    
  
   public void writeTree() {
    // Open the file for writing
    File file = new File("Players.txt");
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,false))) {
      // Call the recursive writeToFile method to write the content of the tree
      // to the file
 
      writeToFile(root, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void writeToFile(Node x, BufferedWriter writer) throws IOException {
  if (x == null) {
    return;
  }
  // Write the players of the node to the file
  for (int i = 0; i < x.n; i++) {
    Player player = x.key[i];
    writer.write(player.name + "," + player.password);
    
   if (player.points != null) {
        for (int score : player.points) {
            writer.write("," + score);
        }
    }
   else writer.write(","+"0");
    writer.write("\n");
  }
  // Recursively write the players of the children of the node to the file
  for (int i = 0; i <= x.n; i++) {
    writeToFile(x.child[i], writer);
  }
}



  // Search key
  private Node Search(Node x, Player key) {  // <-- Change argument type to Player
    int i = 0;
    if (x == null)
      return x;
    for (i = 0; i < x.n; i++) {
      if (key.name.compareTo(x.key[i].name) < 0) {  // <-- Compare player names
        break;
      }
      if (key.name.equals(x.key[i].name) && key.password.equals(x.key[i].password)) {  // <-- Compare player names
        return x;
      }
    }
    if (x.leaf) {
      return null;
    } else {
      return Search(x.child[i], key);
    }
  }
  
 
  // Splitting the node
   private void Split(Node x, int pos, Node y) {
    Node z = new Node();
    z.leaf = y.leaf;
    z.n = T - 1;
    for (int j = 0; j < T - 1; j++) {
      z.key[j] = y.key[j + T];
    }
    if (!y.leaf) {
      for (int j = 0; j < T; j++) {
        z.child[j] = y.child[j + T];
      }
    }
    y.n = T - 1;
    for (int j = x.n; j >= pos + 1; j--) {
      x.child[j + 1] = x.child[j];
    }
    x.child[pos + 1] = z;

    for (int j = x.n - 1; j >= pos; j--) {
      x.key[j + 1] = x.key[j];
    }
    x.key[pos] = y.key[T - 1];
    x.n = x.n + 1;
  }

  // Inserting a value
  public void Insert(final Player key) {  
    Node r = root;
    if (r.n == 2 * T - 1) {
      Node s = new Node();
      root = s;
      s.leaf = false;
      s.n = 0;
      s.child[0] = r;
      Split(s, 0, r);
      insertValue(s, key);
    } else {
      insertValue(r, key);
    }
  }
  
    public List<Player> getTopPlayers() {
  List<Player> play = new ArrayList<>();
  getTopPlayers(root, play);
  // Sort the list of players by their scores in descending order
  play.sort((p1, p2) -> {
    int score1 = p1.getTotalScore();
    int score2 = p2.getTotalScore();
    return Integer.compare(score2, score1);
  });
  // Return the top 10 players
  return play.subList(0, Math.min(play.size(), 10));
}

// Recursive helper method to get all the players in the tree
private void getTopPlayers(Node x, List<Player> players) {
  if (x == null) {
    return;
  }
  // Add the players in the current node to the list
  for (int i = 0; i < x.n; i++) {
    players.add(x.key[i]);
  }
  // Recursively get the players in the children of the node
  for (int i = 0; i <= x.n; i++) {
    getTopPlayers(x.child[i], players);
  }
}

  // Insert the node
final private void insertValue(Node x, Player k) {
  if (x.leaf) {
    int i = 0;
    for (i = x.n - 1; i >= 0 && k.name.compareTo(x.key[i].name) < 0; i--) {  // <-- Compare player names
      x.key[i + 1] = x.key[i];
    }
    x.key[i + 1] = k;
    x.n = x.n + 1;
  } else {
    int i = 0;
    for (i = x.n - 1; i >= 0 && k.name.compareTo(x.key[i].name) < 0; i--) {  // <-- Compare player names
    }
    ;
    i++;
    Node tmp = x.child[i];
    if (tmp.n == 2 * T - 1) {
      Split(x, i, tmp);
      if (k.name.compareTo(x.key[i].name) > 0) {  // <-- Compare player names
        i++;
      }
    }
    insertValue(x.child[i], k);
  }
}
    public void setPlayerScore(String name, int newScore) {
    setPlayerScore(root, name, newScore);
  }

  private void setPlayerScore(Node x, String name, int newScore) {
    if (x == null) {
      return;
    }
    for (int i = 0; i < x.n; i++) {
      if (x.key[i].name.equals(name)) {
        x.key[i].points.add(newScore);  // Add the new score to the list of scores
        return;
      }
    }
    for (int i = 0; i <= x.n; i++) {
      setPlayerScore(x.child[i], name, newScore);
    }
  }






  public void Show() {
  
    Show(root);
  }

  // Display
  private void Show(Node x) {
    assert (x == null);
    for (int i = 0; i < x.n; i++) {
      System.out.print(x.key[i] + " ");
    }
    if (!x.leaf) {
      for (int i = 0; i < x.n + 1; i++) {
        System.out.println();
        Show(x.child[i]);
      }
    }
  }

  // Check if present
  public boolean Contain(Player k) {
    if (this.Search(root, k) != null) {
      return true;
    } else {
      return false;
    }
  }
  
  
  public static void main(String[] args) {
     /* BTree b=new BTree(2);
      b.Insert(new Player("Ionescu","ionescu12"));
      b.Insert(new Player("Ionescu","ionescu123"));
      b.writeTree();*/
      
   
      
    
  }


 
}