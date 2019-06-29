package problem2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a Queue.
 */
class Queue<T> implements IQueue<T> {
  private ArrayList[] queue;



  public Queue() {
    this.queue = queue;
  }

  @Override
  public boolean isEmpty() {
    if (this.queue.length > 0) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Integer size() {
    return this.queue.length;
  }


  @Override
  public void enqueue(T element) {
    this.queue[this.queue.length] = (ArrayList) element;
  }

  /**
   * Returns the Queue with the last element dropped.
   *
   * @return the tail of the Queue, i.e., removes the last element
   */
  @Override
  public Queue dequeue() {
    if (this.queue.length > 0) {
      this.queue.remove[0];
    }
    return this;
  }

  @Override
  public void remove(T element) {
    for (int i = 0; i < this.queue.length; i++) {
      if (this.queue[i] == element) {
        this.queue.remove(element);
      }
    }
  }

  @Override
  public String toString() {
    return "Queue{" +
        "queue=" + Arrays.toString(queue) +
        '}';
  }

  public ArrayList[] getQueue() {
    return queue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Queue)) return false;
    Queue <?> queue1 = (Queue <?>) o;
    return Arrays.equals(getQueue(), queue1.getQueue());
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(getQueue());
  }
}

