package edu.neu.khoury.cs5004.problem3;

import java.util.ArrayList;

/**
 * This class represents an Integer Binary Tree ADT.
 */
public class IntegerBinarySearchTree {
  private Node root;

  /**
   * Constructor for the IBT.
   */
  public IntegerBinarySearchTree() {
    this.root = null;
  }

  /**
   * Gets the root of the IBT.
   * @return the root
   */
  public Node getRoot() {
    return root;
  }

  /**
   * Inserts a node into the IBT.
   * @param value of the node to be inserted in the appropriate location within the IBT
   */
  public void insert(int value) {
    root = insert(root, value);
  }

  /**
   * Recursive implementation of IBT node insertion.
   * @param node to be inserted
   * @param value vale of inserted node
   * @return node
   */
  private Node insert(Node node, Integer value) {
    if (node == null) {
      node = new Node(value);
    } else if (value < node.getValue()) {
      node.setLeft(insert(node.getLeft(), value));
    } else {
      node.setRight(insert(node.getRight(), value));
    }
    return node;
  }

  /**
   * Instantiates and iterates through the IBT.
   * @param root of the IBT
   * @return a list of IBT node values in order
   */
  public ArrayList<Integer> inorderTraversal(Node root) {
    InOrderIterator iterator = new InOrderIterator(root);
    ArrayList <Integer> results = new ArrayList<>();
    while (iterator.hasNext()) {
      results.add(iterator.next());
    }
    return results;
  }

  /**
   * Instantiates and iterates through the IBT.
   * @param root of the IBT
   * @return a list of IBT node values pre-order
   */
  public ArrayList<Integer> preorderTraversal(Node root) {
    PreOrderIterator iterator = new PreOrderIterator(root);
    ArrayList<Integer> results = new ArrayList<Integer>();
    while (iterator.hasNext()) {
      results.add(iterator.next());
    }
    return results;
  }

  /**
   * Instantiates and iterates through the IBT.
   * @param root of the IBT
   * @return a list of IBT node values post-order
   */
  public ArrayList<Integer> postorderTraversal(Node root) {
    PostOrderIterator iterator = new PostOrderIterator(root);
    ArrayList<Integer> results = new ArrayList<Integer>();
    while (iterator.hasNext()) {
      results.add(iterator.next());
    }
    return results;
  }

  // -------------------------------Printing Helper Methods-----------------------------------------------

  /**
   * Helper Method to print the tree InOrder.
   *
   * @param node Root Node
   */
  public void printInOrder(Node node) {
    /* If root is null, return else print
     * in order specified above */
    if (node == null) {
      return;
    }
    printInOrder(node.getLeft());
    System.out.print(node.getValue() + " ");
    printInOrder(node.getRight());
  }

  /**
   * Helper Method to print the tree PreOrder.
   *
   * @param node Root Node
   */
  public void printPreorder(Node node) {
    /* If root is null, return else print
     * in order specified above */
    if (node == null) {
      return;
    }
    System.out.print(node.getValue() + " ");
    printPreorder(node.getLeft());
    printPreorder(node.getRight());
  }

  /**
   * Helper Method to print the tree PostOrder.
   *
   * @param node Root Node
   */
  public void printPostorder(Node node) {
    /* If root is null, return else print
     * in order specified above */
    if (node == null) {
      return;
    }
    printPostorder(node.getLeft());
    printPostorder(node.getRight());
    System.out.print(node.getValue() + " ");
  }
}
