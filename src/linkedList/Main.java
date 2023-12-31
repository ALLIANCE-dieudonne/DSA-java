package src.linkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(12);
    list.insert(10);
    list.insert(5);
    list.insertAtStart(20);
    list.insertAt(0,90);
    list.show();
  }
}
