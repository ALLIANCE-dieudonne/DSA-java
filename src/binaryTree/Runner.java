package src.binaryTree;

public class Runner {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.insert(2);
    binaryTree.insert(5);
    binaryTree.insert(8);
    binaryTree.insert(9);
    binaryTree.inorder();
  }
}
