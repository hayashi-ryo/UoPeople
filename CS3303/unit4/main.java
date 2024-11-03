import Prog1Tools.IOTools;
import java.util.Scanner;

class Node {
  int data;
  Node left, right;

  public Node(int item) {
    data = item;
    left = right = null;
  }
}

class BinarySearchTree {
  Node root;

  BinarySearchTree() {
    root = null;
  }

  // Method to insert a node
  void insert(int data) {
    root = insertRec(root, data);
  }

  // Recursive method to insert a node
  Node insertRec(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (data < root.data) {
      root.left = insertRec(root.left, data);
    } else if (data > root.data) {
      root.right = insertRec(root.right, data);
    }
    return root;
  }

  // Recursive method to search for a node
  int search(Node root, int key, int count) {
    if (root == null) {
      return -1; // Not found
    }
    count++;
    if (root.data == key) {
      return count; // Found
    }
    if (root.data > key) {
      return search(root.left, key, count); // Search left subtree
    } else {
      return search(root.right, key, count); // Search right subtree
    }
  }

  // Method to search for a node and print result
  void searchNode(int key) {
    int count = search(root, key, 0);
    if (count != -1) {
      System.out.println(key + " was found after " + count + " searches.");
    } else {
      System.out.println(key + " was not found.");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinarySearchTree bst = new BinarySearchTree();
    System.out.println("Enter integers to add to the binary search tree. Enter 0 to stop.");

    while (true) {
      int input = sc.nextInt();
      if (input == 0)
        break;
      bst.insert(input);
    }

    System.out.println("Enter the integer to search for:");
    /*
     * for (int i = 1; i <= 14; i++) {
     * int searchValue = i;
     * bst.searchNode(searchValue);
     * }
     */
    int searchValue = sc.nextInt();
    bst.searchNode(searchValue);
  }
}
