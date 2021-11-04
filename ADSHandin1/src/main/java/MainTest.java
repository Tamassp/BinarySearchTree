public class MainTest
{
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree<Object>();
    BinaryTreePrint print = new BinaryTreePrint();
    BinaryTreeNode<Object> node = new BinaryTreeNode<>();
    BinaryTreeNode<Object> node1 = new BinaryTreeNode<>();
    BinaryTreeNode<Object> node2 = new BinaryTreeNode<>();
    BinaryTreeNode<Object> node3 = new BinaryTreeNode<>();
    BinaryTreeNode<Object> node4 = new BinaryTreeNode<>();
    BinaryTreeNode<Object> node5 = new BinaryTreeNode<>();

    node.setElement(3);
    node1.setElement(5);
    node2.setElement(7);
    node3.setElement(8);
    node4.setElement(2);
    node5.setElement(1);

    tree.setRoot(node);
    tree.getRoot().addLeftChild(node1);
    tree.getRoot().addRightChild(node2);
    tree.getRoot().getLeftChild().addLeftChild(node3);
    tree.getRoot().getLeftChild().addRightChild(node4);
    tree.getRoot().getRightChild().addLeftChild(node5);

    print.printTree(tree.getRoot());
    System.out.println(tree.height());
    System.out.println(tree.levelOrder());
  }





}
