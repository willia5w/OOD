package edu.neu.khoury.cs5004.problem3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IntegerBinarySearchTreeTest {
  private IntegerBinarySearchTree integerBinarySearchTree;
  private Node node;

  @Before
  public void setUp() throws Exception {
    node = new Node(1);
    integerBinarySearchTree = new IntegerBinarySearchTree();
  }

  @Test
  public void insert() {
    integerBinarySearchTree.insert(1);
    assertEquals(node.getValue(), integerBinarySearchTree.getRoot().getValue());
  }

  @Test
  public void inorderTraversal() {
    ArrayList<Integer> expectedResult = new ArrayList <>();
    for (Integer i = 0; i < 5; i++) {
      expectedResult.add(i);
      integerBinarySearchTree.insert(i);
    }
    Node rootNode = integerBinarySearchTree.getRoot();
    integerBinarySearchTree.printInOrder(rootNode);
    assertEquals(expectedResult, integerBinarySearchTree.inorderTraversal(rootNode));
  }

  @Test
  public void preorderTraversal() {

    ArrayList<Integer> expectedResult = new ArrayList <>();
    for (Integer i = 0; i < 5; i++) {
      expectedResult.add(i);
      integerBinarySearchTree.insert(i);
    }
    Node rootNode = integerBinarySearchTree.getRoot();
    integerBinarySearchTree.printPreorder(rootNode);
    assertEquals(expectedResult, integerBinarySearchTree.preorderTraversal(rootNode));
  }

  @Test
  public void postorderTraversal() {

    ArrayList<Integer> expectedResult = new ArrayList <>();

    for (Integer i = 5; i >= 0; i--) {
      integerBinarySearchTree.insert(i);
    }

    for (Integer i = 0; i <= 5; i++) {
      expectedResult.add(i);
    }
    Node rootNode = integerBinarySearchTree.getRoot();
    integerBinarySearchTree.printPostorder(rootNode);
    assertEquals(expectedResult, integerBinarySearchTree.postorderTraversal(rootNode));
  }
}