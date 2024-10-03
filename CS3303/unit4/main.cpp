#include <iostream>
using namespace std;

// Definition of a node in a binary tree
struct Node
{
  int data;
  Node *left;
  Node *right;

  Node(int val)
  {
    data = val;
    left = right = nullptr;
  }
};

// Binary tree class
class BinaryTree
{
public:
  Node *root;

  BinaryTree()
  {
    root = nullptr;
  }

  // Insert a node
  Node *insert(Node *node, int data)
  {
    if (node == nullptr)
    {
      return new Node(data);
    }

    if (data < node->data)
    {
      node->left = insert(node->left, data);
    }
    else
    {
      node->right = insert(node->right, data);
    }
    return node;
  }

  // Preorder traversal of the binary tree
  void preorder(Node *node)
  {
    if (node == nullptr)
      return;

    cout << node->data << " ";
    preorder(node->left);
    preorder(node->right);
  }

  // Inorder traversal of the binary tree
  void inorder(Node *node)
  {
    if (node == nullptr)
      return;

    inorder(node->left);
    cout << node->data << " ";
    inorder(node->right);
  }

  // Postorder traversal of the binary tree
  void postorder(Node *node)
  {
    if (node == nullptr)
      return;

    postorder(node->left);
    postorder(node->right);
    cout << node->data << " ";
  }
};

int main()
{
  BinaryTree tree;
  tree.root = tree.insert(tree.root, 10);
  tree.insert(tree.root, 5);
  tree.insert(tree.root, 20);
  tree.insert(tree.root, 3);
  tree.insert(tree.root, 7);

  cout << "Preorder Traversal: ";
  tree.preorder(tree.root);
  cout << endl;

  cout << "Inorder Traversal: ";
  tree.inorder(tree.root);
  cout << endl;

  cout << "Postorder Traversal: ";
  tree.postorder(tree.root);
  cout << endl;

  return 0;
}
