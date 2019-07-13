package edu.neu.khoury.cs5004.problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
  private Node node;

  @Before
  public void setUp() throws Exception {
    node = new Node(1);
  }

  @Test
  public void getValue() {
    assertEquals(1, node.getValue(), 0);
  }

  @Test
  public void getLeft() {
    assertEquals(null, node.getLeft());
  }

  @Test
  public void getRight() {
    assertEquals(null, node.getRight());
  }

  @Test
  public void setLeft() {
    Node newLeft = new Node(2);
    node.setLeft(newLeft);
    assertEquals(newLeft, node.getLeft());
  }

  @Test
  public void setRight() {
    Node newRight = new Node(3);
    node.setRight(newRight);
    assertEquals(newRight, node.getRight());
  }
}