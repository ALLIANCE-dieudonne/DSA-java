package src.stack;


public class Runner {
  public static void main(String[] args) {
    Stack nums = new Stack();
    nums.push(12);
    nums.show();
    nums.push(10);
    nums.show();
    nums.pop();
    nums.pop();
    nums.pop();
    nums.show();
  }
}
