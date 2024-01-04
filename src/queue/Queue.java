package src.queue;

public class Queue {
  int[] queue = new int[5]; // Array to store queue elements
  int size = 0; // Number of elements in the queue
  int front = 0; // Index of the front element
  int rear = 0; // Index of the rear element (where new elements are added)

  public void enqueue(int data) {
    if (isFull()) { // Check for overflow
      throw new IllegalStateException("Queue is full");
    }
    queue[rear] = data; // Add element at the rear
    rear = (rear + 1) % queue.length; // Update rear index with circular array logic
    size++; // Increment size
  }

  public void dequeue() {
    if (isEmpty()) { // Check for underflow
      throw new IllegalStateException("Queue is empty");
    }
    // Retrieve element from the front
    queue[front] = 0; // Clear the element (optional for clarity)
    front = (front + 1) % queue.length; // Update front index with circular array logic
    size--; // Decrement size
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == queue.length;
  }

  public void show() {
    System.out.println("Elements are:");
    for (int i = 0; i < size; i++) { // Print only actual elements in the queue
      System.out.print(queue[(front + i) % queue.length] + " ");
    }
    System.out.println();
  }


}
