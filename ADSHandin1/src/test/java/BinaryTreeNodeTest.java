import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeNodeTest
{
  BinaryTreeNode<Object> node;

  @BeforeEach
  public void setUp() {
    node = new BinaryTreeNode<>();
  }

  @Test
  void getterSetterElement(){
    Assertions.assertNull(node.getElement());

    String str = "string";
    node.setElement(str);
    Assertions.assertEquals("string",node.getElement());

    node.setElement(3);
    Assertions.assertEquals(3,node.getElement());
    Assertions.assertNotEquals("string",node.getElement());

  }

  @Test
  void getAddLeftChild(){
    Assertions.assertNull(node.getLeftChild());

    BinaryTreeNode<Object> node2 = new BinaryTreeNode();
    node.addLeftChild(node2);

    Assertions.assertNotNull(node.getLeftChild());
    Assertions.assertEquals(node2,node.getLeftChild());

  }

  @Test
  void getAddRightChild(){
    Assertions.assertNull(node.getRightChild());

    BinaryTreeNode<Object> node2 = new BinaryTreeNode();
    node.addRightChild(node2);

    Assertions.assertNotNull(node.getRightChild());
    Assertions.assertEquals(node2,node.getRightChild());
  }

}
