package edu.neu.khoury.cs5004.problem3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * InOrderIterator for an IBT.
 * Inspired by: http://n00tc0d3r.blogspot.com/2013/09/inorder-binary-tree-traversal-with.html?q=binary+tree
 */
public class InOrderIterator implements Iterator {
  Stack <Node> stack = new Stack<>();


  /**
   * Start pushing left nodes onto stack and then go to right nodes.
   * @param cur current Node
   */
  private void pushLeftChildren(Node cur) {
    while (cur != null) {
      stack.push(cur);
      cur = cur.getLeft();
    }
  }

  /**
   * Constructor for the InOrderIterator.
   */
  public InOrderIterator(Node root) {
    pushLeftChildren(root);
  }

  @Override
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException("All nodes visited");
    }

    Node res = stack.pop();
    pushLeftChildren(res.getRight()); // After left, right

    return res.getValue();
  }
}
