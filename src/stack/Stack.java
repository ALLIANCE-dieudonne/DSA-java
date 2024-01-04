package src.stack;

public class Stack {
  int stack[] = new int[5];
  int top = 0;

  public void push(int data) {
    stack[top] = data;
    top++;
  }

  public int pop() {
    top--;
    int data = stack[top];
    stack[top] = 0;

    return data;
  }

  public int peek(){
    int data = stack[top-1];
    return data;
  }

  public int size(){
    return top;
  }

  public boolean isEmpty(){
    return top <=0;
  }

  public void show() {
    for (int n : stack) {
      System.out.print(n + " ");
    }
  }
}
