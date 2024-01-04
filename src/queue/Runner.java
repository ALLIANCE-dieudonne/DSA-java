package src.queue;

public class Runner {
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(4);
    q.enqueue(1);
    q.enqueue(5);
    q.enqueue(9);
    q.show();

    q.dequeue();
    q.dequeue();

//    q.enqueue(4);
//    q.enqueue(1);
    q.show();
  }
}
