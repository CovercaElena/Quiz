
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elena
 */
public class QTree {
    
     private int T;

  // Node creation
  public class Node1 {
    int n;
    Question key[] = new Question[2 * T - 1];  // <-- Array of Question objects as keys
    Node1 child[] = new Node1[2 * T];
    boolean leaf = true;

    public int Find(Question k) {  // <-- Find method takes a Question object as parameter
      for (int i = 0; i < this.n; i++) {
        if (this.key[i].equals(k)) {  // <-- Compare Question objects using the equals method
          return i;
        }
      }
      return -1;
    }
  }

  public QTree(int t) {
    T = t;
    root = new Node1();
    root.n = 0;
    root.leaf = true;
  }

  private Node1 root;

  // Search key
  private Node1 Search(Node1 x, Question key) {  // <-- Search method takes a Question object as parameter
    int i = 0;
    if (x == null) {
      return x;
    }
    for (i = 0; i < x.n; i++) {
      if (key.text.equals(x.key[i].text)) {  // <-- Compare Question objects using the equals method
        return x;
      }
    }
    if (x.leaf) {
      return null;
    } else {
      return Search(x.child[i], key);
    }
  }
  
    public Question findQuestionById(int id) {  // <-- findQuestionById method takes an id as parameter
    return findQuestionById(root, id);  // <-- search for the question starting from the root node
  }

  private Question findQuestionById(Node1 x, int id) {
    int i = 0;
    if (x == null) {
      return null;
    }
    for (i = 0; i < x.n; i++) {
      if (id < x.key[i].id) {  // <-- Compare id field
        break;
      }
      if (id == x.key[i].id) {  // <-- Compare id field
        return x.key[i];
      }
    }
    if (x.leaf) {
      return null;
    } else {
      return findQuestionById(x.child[i], id);  // <-- search for the question in the child node
    }
  }


  // Splitting the node
  private void Split(Node1 x, int pos, Node1 y) {
    Node1 z = new Node1();
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
  public void Insert(final Question key) {  // <-- Insert method takes a Question object as parameter
    Node1 r = root;
    if (r.n == 2 * T - 1) {
      Node1 s = new Node1();
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
        // Insert the node
  final private void insertValue(Node1 x, Question k) {  // <-- insertValue method takes a Question object as parameter

    if (x.leaf) {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k.id < x.key[i].id; i--) {  // <-- Compare id field
        x.key[i + 1] = x.key[i];
      }
      x.key[i + 1] = k;
      x.n = x.n + 1;
    } else {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k.id < x.key[i].id; i--) {  // <-- Compare id field
      }
      i++;
      Node1 tmp = x.child[i];
      if (tmp.n == 2 * T - 1) {
        Split(x, i, tmp);
        if (k.id > x.key[i].id) {  // <-- Compare id field
          i++;
        }
      }
      insertValue(x.child[i], k);
    }
  }

  
  
  public void Show() {
  
    Show(root);
  }

  // Display
  private void Show(Node1 x) {
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
  public boolean Contain(Question k) {
    if (this.Search(root, k) != null) {
      return true;
    } else {
      return false;
    }
  }
  
    private int countKeys(Node1 x) {
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
  public int getcount() {
    return countKeys(root);
  }
  
  public void writeTree() {
    // Open the file for writing
    File file = new File("Questions.txt");
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,false))) {
      // Call the recursive writeToFile method to write the content of the tree
      // to the file
 
      writeToFile(root, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // Recursive method to write the content of the tree to the file
  private void writeToFile(Node1 x, BufferedWriter writer) throws IOException {
    if (x == null) {
      return;
    }
    // Write the keys of the node to the file
    for (int i = 0; i < x.n; i++) {
      writer.write(x.key[i].text+","+x.key[i].opt1+","+x.key[i].opt2+","+x.key[i].opt3+","+x.key[i].opt4+","+x.key[i].rasp+","+x.key[i].id+"\n"); // <-- Write player name and points separated by a comma
    }
    // Recursively write the content of the children of the node to the file
    for (int i = 0; i <= x.n; i++) {
      writeToFile(x.child[i], writer);
    }
    

  }
  
  public static void main(String[]args)
  {
     
    
       
       
      
      
      
  }

    
}


