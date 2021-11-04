public class BinaryTreeNode<E>
{
  private E element;
  private BinaryTreeNode leftChild;
  private BinaryTreeNode rightChild;

  public BinaryTreeNode()
  {
  }

  public BinaryTreeNode(E element){
    this.element = element;
  }

  public void setElement(E element){
    this.element = element;
  }

  public E getElement()
  {
    return element;
  }

  public void addLeftChild(BinaryTreeNode<E> node){
    leftChild = node;
  }

  public void addRightChild(BinaryTreeNode<E> node){
    rightChild = node;
  }

  public BinaryTreeNode<E> getLeftChild()
  {
    return leftChild;
  }

  public BinaryTreeNode<E> getRightChild()
  {
    return rightChild;
  }

  public boolean largerThen(E element){
    if(this.compareTo(element) == 1){
      return true;
    }
    else return false;
  }

 public int compareTo(E element)
  {
    if((Integer) this.element < (Integer) element){
      return -1;
    }
    else return 1;
  }

}
