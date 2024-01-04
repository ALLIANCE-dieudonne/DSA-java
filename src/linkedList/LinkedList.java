package src.linkedList;

public class LinkedList {
  Node head;

  public void insert(int data) {
    //the new created node will be inserted at the end of the list
    //need to see if this is the header or the last
    Node node = new Node();
    node.data = data;
    node.next = null;

    if (head == null) {
      head = node;
    } else {
      Node n = head;
      //start from the head and loop until next == null(this means the last element)
      while (n.next != null) {
        n = n.next;
      }
      n.next = node;
    }
  }

  public void show() {
    Node node = head;
    while (node.next != null) {
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
  }

  //adding element at the start
  public void insertAtStart(int data) {
    Node node = new Node();
    node.data = data;
    node.next = head;
    head = node;
  }

  //adding element at a certain index
  public void insertAt(int index, int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if (index == 0) {
      insertAtStart(data);
    } else {
      Node n = head;
      for (int i = 0; i < index - 1; i++) {
        n = n.next;
      }
      node.next = n.next;
      n.next = node;
    }
  }

  //deleting a node
  public void delete(int index) {
    if (index == 0) {
      head = head.next;
    } else {
      Node n = head;
      Node n1 = null;
      for (int i = 0; i < index - 1; i++) {
        n = n.next;
      }
      n1 = n.next;
      n.next = n1.next;
      n1 = null;
    }

  }
}
