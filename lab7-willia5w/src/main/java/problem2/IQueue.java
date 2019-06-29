package problem2;

/**
 * Represents a Queue first in last out.
 */
public interface IQueue<T> {

  /**
   * Create the empty queue.
   *
   * @return the empty queue
   */
  static Queue create() {
    return new Queue();
  }


  /**
   * Check if the Queue is empty or not.
   *
   * @return true if the Queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Add a new element at the beginning of the Queue.
   *
   * @param element new element to add
   * @return a new Queue, same as the original but with {@code element} prepended
   */
  void enqueue(T element);

  /**
   * Returns the Queue with the last element dropped.
   *
   * @return the tail of the Queue, i.e., removes the last element
   */
  Queue dequeue();

  /**
   * Get the number of elements in the Queue.
   *
   * @return the total number of elements in the Queue
   */
  Integer size();

  /**
   * Removes an elements from where it lies in the queue. The Queue remains unchanged otherwise.
   *
   */
  void remove(T element);
}