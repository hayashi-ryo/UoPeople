import Prog1Tools.IOTools;

class Node {
  Node left;
  Node right;
  int value;

  public Node(int value) {
    this.value = value;
  }
}

public class GeneralTreeTest {
  public static void main(String[] args) {

    // build a simple tree add 5 nodes to the tree
    Node root = new Node(5);
    System.out.println("Tree Example");
    System.out.println("Building tree with root value " + root.value);
    insert(root, 1);
    insert(root, 8);
    insert(root, 6);
    insert(root, 3);
    insert(root, 9);
    System.out.println("Traversing tree ");
    printOrder(root);

  }

  public static void insert(Node node, int value) {
    if (value < node.value) {
      if (node.left != null) {
        insert(node.left, value);
      } else {
        System.out.println(" Inserted " + value + " to left of "
            + node.value);
        node.left = new Node(value);
      }
    } else if (value > node.value) {
      if (node.right != null) {
        insert(node.right, value);
      } else {

        System.out.println(" Inserted " + value + " to right of "
            + node.value);
        node.right = new Node(value);
      }
    }
  }

  public static void printOrder(Node node) {
    if (node != null) {
      printOrder(node.left);
      System.out.println(" Traversed " + node.value);
      printOrder(node.right);
    }
  }
}
