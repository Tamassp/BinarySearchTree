import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree<E>
{
  private BinaryTreeNode<E> root;
  private int size;
  private int height;


  public BinaryTreeNode<E> getRoot(){
    return root;
  }

  public void setRoot (BinaryTreeNode<E> node){
    root = node;
  }

  public boolean isEmpty(){
    return root == null || root.getElement() == null;
  }



  public int size(){
    return size(root);
  }

  private int size(BinaryTreeNode<E> node){
    if (node == null || node.getElement() == null){
      return 0;
    }
    else{
      return size(node.getLeftChild()) + size(node.getRightChild()) +1;
    }

  }

  public boolean contains (E element){
    return customContains(root, element);
  }

  private boolean customContains(BinaryTreeNode<E> node, E element){
    if(node == null) return false;
    return node.getElement().equals(element) ||
        customContains(node.getLeftChild(),element) || customContains(node.getRightChild(),element);
  }

  public ArrayList inOrder(){
    if(isEmpty()) return null;
    ArrayList<E> arrayList = new ArrayList<>();
    privateInOrder(root, arrayList);
    return arrayList;
  }

  private void privateInOrder(BinaryTreeNode<E> node, ArrayList<E> arrayList){
    if (node == null || node.getElement() == null){
      return;
    }
    privateInOrder(node.getLeftChild(), arrayList);
    arrayList.add(node.getElement());
    privateInOrder(node.getRightChild(), arrayList);


  }

  public ArrayList preOrder(){
    if(isEmpty()) return null;
    ArrayList<E> arrayList = new ArrayList<>();
    privatePreOrder(root, arrayList);
    return arrayList;
  }

  private void privatePreOrder(BinaryTreeNode<E> node, ArrayList<E> arrayList){
    if (node == null || node.getElement() == null){
      return;
    }
    arrayList.add(node.getElement());
    privatePreOrder(node.getLeftChild(), arrayList);
    privatePreOrder(node.getRightChild(), arrayList);


  }

  public ArrayList postOrder(){
    if(isEmpty()) return null;
    ArrayList<E> arrayList = new ArrayList<>();
    privatePostOrder(root, arrayList);
    return arrayList;
  }

  private void privatePostOrder(BinaryTreeNode<E> node, ArrayList<E> arrayList){
    if (node == null || node.getElement() == null){
      return;
    }
    privatePostOrder(node.getLeftChild(), arrayList);
    privatePostOrder(node.getRightChild(), arrayList);
    arrayList.add(node.getElement());


  }

  public ArrayList levelOrder(){
    if(isEmpty()) return null;
    ArrayList<E> arrayList = new ArrayList<>();
    for(int i = 1; i <= height()+1; i++){
      privateLevelOrder(root, arrayList, i);

    }

    return arrayList;
  }

  //printing current level
  private void privateLevelOrder(BinaryTreeNode<E> node, ArrayList<E> arrayList, int level){
    if (node == null || node.getElement() == null){
      return;
    }
    if(level == 1){
      arrayList.add(node.getElement());
    }
    else if (level > 1){
      privateLevelOrder(node.getLeftChild(), arrayList, level - 1);
      privateLevelOrder(node.getRightChild(), arrayList, level - 1);

    }
  }

  public int height(){
    if (root == null || root.getElement() == null){
      return -1;
    }
    else
    return customHeight(root);
  }

  private int customHeight(BinaryTreeNode node){
    if(node == null){
      return -1;
    }

    int leftHeight = customHeight(node.getLeftChild());
    int rightHeight = customHeight(node.getRightChild());

    if(leftHeight > rightHeight){
      return leftHeight + 1;
    }
    else {
      return rightHeight + 1;
    }
  }

}
