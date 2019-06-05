package edu.neu.khoury.cs5004.problem3;

/**
 * This class represents a Node in an ADT.
 */
public class Node {
  private Integer value;
  private Node left;
  private Node right;

  /**
   * Creates a Node given it's value, left pointer, and right pointer.
   *
   * @param value Node's value
   * @param left Node's left
   * @param right Node's right
   */
  public Node(Integer value, Node left, Node right) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * Get the Node's value.
   * @return the Node's value
   */
  public Integer getValue() {
    return value;
  }

  /**
   * Get the Node's left.
   * @return Get the Node's value
   */
  public Node getLeft() {
    return left;
  }

  /**
   * Get the Node's right.
   * @return the Node's right
   */
  public Node getRight() {
    return right;
  }
}
