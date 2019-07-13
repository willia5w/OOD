package edu.neu.khoury.cs5004.problem3;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * PreOrderIterator for an IBT.
 * Inspired by: http://n00tc0d3r.blogspot.com/2013/09/inorder-binary-tree-traversal-with.html?q=binary+tree
 */
public class PreOrderIterator implements Iterator {
  ArrayDeque <Node> stack = new ArrayDeque <>();

  /**
   * Constructor for the PreOrderIterator.
   */
  public PreOrderIterator(Node root) {
    if (root != null) {
      stack.push(root);
    }
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
    if (res.getRight() != null) stack.push(res.getRight());
    if (res.getLeft() != null) stack.push(res.getLeft());

    return res.getValue();
  }
}
