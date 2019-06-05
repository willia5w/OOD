package edu.neu.khoury.cs5004.problem3;

/**
 * This class represents an Integer Binary Tree ADT.
 */
public class IntegerBinaryTree {
  private Node root;
  private Node left;
  private Node right;


  /**
   * Gets the size of the IBT.
   * @param root takes root of the IBT as an argument
   * @return the size of the IBT
   */
  public Integer size(Node root) {
    Integer treeSize = 0;
    if (root.getValue() == null) {
      System.out.println("Tree is empty.");
    } else {
      Node leftNode = left;
      while (leftNode.getValue() != null) {
        treeSize++;
        leftNode = leftNode.getLeft();
      }
      Node rightNode = right;
      while (right.getValue() != null) {
        treeSize++;
        rightNode = rightNode.getRight();
      }
    }
    return treeSize;
  }

  /**
   * Gets the sum of all Node values in the IBT.
   * @param root takes root of the IBT as an argument
   * @return the sum of the IBT
   */
  public Integer sum(Node root) {
    Integer[] treeValues = null;
    if (root.getValue() == null) {
      System.out.println("Tree is empty.");
    } else {
      treeValues[0] = root.getValue();
      Node leftNode = left;
      while (leftNode.getValue() != null) {
        treeValues[treeValues.length] = leftNode.getValue();
        leftNode = leftNode.getLeft();
      }
      Node rightNode = right;
      while (right.getValue() != null) {
        treeValues[treeValues.length] = rightNode.getValue();
        rightNode = rightNode.getRight();
      }
    }
    Integer treeSum = 0;
    for (int i = 0; i < treeValues.length; i++) {
      treeSum += treeValues[i];
    }
    return treeSum;
  }

  /**
   * Gets the sum of all Node values in the IBT.
   * @param searchVal an integer as an argument
   * @return true is search value is contained in IBT, false otherwise
   */
  public Boolean contains(Integer searchVal) {
    Integer[] treeValues = null;
    if (root.getValue() == null) {
      System.out.println("Tree is empty.");
    } else {
      treeValues[0] = root.getValue();
      Node leftNode = left;
      while (leftNode.getValue() != null) {
        treeValues[treeValues.length] = leftNode.getValue();
        leftNode = leftNode.getLeft();
      }
      Node rightNode = right;
      while (right.getValue() != null) {
        treeValues[treeValues.length] = rightNode.getValue();
        rightNode = rightNode.getRight();
      }
    }
    for (int i = 0; i < treeValues.length; i++) {
      if (searchVal == treeValues[i]) {
        return true;
      }
    }
    return false;
  }
}
