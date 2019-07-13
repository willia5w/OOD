package edu.neu.khoury.cs5004.problem3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * PostOrderIterator for an IBT.
 * Inspired by: http://n00tc0d3r.blogspot.com/2013/09/inorder-binary-tree-traversal-with.html?q=binary+tree
 */
public class PostOrderIterator implements Iterator {

  Stack <Node> stack = new Stack<Node>();


  /**
   * Post-Order traversal helper method.
   * @param cur current Node
   */
  private void findNextLeaf(Node cur) {
    while (cur != null) {
      stack.push(cur);
      if (cur.getLeft() != null) {
        cur = cur.getLeft();
      } else {
        cur = cur.getRight();
      }
    }
  }

  /**
   * Constructor for the PostOrderIterator.
   *
   */
  public PostOrderIterator(Node root) {
    findNextLeaf(root);
  }

  @Override
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /**
   * Traverses to next Node if present returning it's value.
   * @return value of next Node
   */
  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException("All nodes visited");
    }

    Node res = stack.pop();
    if (!stack.isEmpty()) {
      Node top = stack.peek();
      if (res == top.getLeft()) {
        findNextLeaf(top.getRight()); // Start traversing right
      }
    }

    return res.getValue();
  }
}
